public class Main {

    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Иванов И.И.",1,50_475);
        EMPLOYEES[1] = new Employee("Петров П.П.",2,21_369);
        EMPLOYEES[2] = new Employee("Сидоров С.С.",3,76_582);
        EMPLOYEES[3] = new Employee("Козлов К.К.",4,46_672);
        EMPLOYEES[4] = new Employee("Морозов М.М.",5,86_015);

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
        System.out.printf("Среднее значение зарплат = %.2f \n", calculateAverSalary());
        printSeparator();

        // ФИО всех сотрудников
        printEmployeesNames();
        printSeparator();
    }

    // Сепаратор
    private static void printSeparator() {
        System.out.println("-----------------------------------------------------------");
    }

    // Список всех сотрудников со всеми имеющимися по ним данными
    private static void printAllEmployees() {
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:");
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    // Сумма всех затрат на зарплаты
    private static int calculateSumSalary() {
        int sumSalary = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    // Сотрудник с минимальной зарплатой
    private static Employee getSalaryMin() {
        int min = Integer.MAX_VALUE;
        Employee employeesMin = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeesMin = employee;
            }
        }
        return employeesMin;
    }

    // Сотрудник с максимальной зарплатой
    private static Employee getSalaryMax() {
        int max = Integer.MIN_VALUE;
        Employee employeesMax = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeesMax = employee;
            }
        }
        return employeesMax;
    }

    // Среднее значение зарплат
    private static double calculateAverSalary() {

        double averSalary = 0;
        int index = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                index++;
            }
        }
        averSalary = (double) calculateSumSalary() / index;
        return averSalary;
    }

    // ФИО всех сотрудников
    private static void printEmployeesNames() {
        System.out.println("ФИО сотрудников:");
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

}