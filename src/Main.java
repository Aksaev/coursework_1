public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов И.И.",1,50_475);
        employees[1] = new Employee("Петров П.П.",2,21_369);
        employees[2] = new Employee("Сидоров С.С.",3,76_582);
        employees[3] = new Employee("Козлов К.К.",4,46_672);
        employees[4] = new Employee("Морозов М.М.",5,86_015);

        System.out.println("Курсовая работа. Книга сотрудников - Базовая сложность.");
        printSeparator();

        // Список всех сотрудников со всеми имеющимися по ним данными
        printAllEmployees();
        printSeparator();

        // Сумма затрат на зарплаты
        System.out.println("Сумма затрат на зарплаты = " + calculateSumSalary());
        printSeparator();

        // Сотрудник с минимальной зарплатой
        Employee employeeMinSalary = getSalaryMin();
        if (employeeMinSalary == null) {
            System.out.println("Нет сотрудника с минимальной зарплатой");
        } else {
            System.out.println("Сотрудник с минимальной зарплатой: \n" + getSalaryMin());
        }
        printSeparator();

        // Сотрудник с максимальной зарплатой
        Employee employeeMaxSalary = getSalaryMax();
        if (employeeMaxSalary == null) {
            System.out.println("Нет сотрудника с максимальной зарплатой");
        } else {
            System.out.println("Сотрудник с максимальной зарплатой: \n" + getSalaryMax());
        }
        printSeparator();

        // Среднее значение зарплат
        System.out.println("Среднее значение зарплат = " + calculateAverSalary());
        printSeparator();

        // ФИО всех сотрудников
        printEmployeesNames();
        printSeparator();
    }

    // Сепаратор
    public static void printSeparator() {
        System.out.println("-----------------------------------------------------------");
    }

    // Список всех сотрудников со всеми имеющимися по ним данными
    public static void printAllEmployees() {
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    // Сумма всех затрат на зарплаты
    public static int calculateSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    // Сотрудник с минимальной зарплатой
    public static Employee getSalaryMin() {
        int min = Integer.MAX_VALUE;
        Employee employeesMin = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeesMin = employee;
            }
        }
        return employeesMin;
    }

    // Сотрудник с максимальной зарплатой
    public static Employee getSalaryMax() {
        int max = Integer.MIN_VALUE;
        Employee employeesMax = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeesMax = employee;
            }
        }
        return employeesMax;
    }

    // Среднее значение зарплат
    public static int calculateAverSalary() {

        int averSalary = 0;
        int index = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                index++;
            }
        }
        averSalary = calculateSumSalary() / index;
        return averSalary;
    }

    // ФИО всех сотрудников
    public static void printEmployeesNames() {
        System.out.println("ФИО сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

}