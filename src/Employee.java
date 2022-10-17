public class Employee {

    private final int id;
    private static int counter = 0;
    private final String fullName;
    private int department;
    private int salary;

    public Employee(String fullName, int departament, int salary) {
        this.id = counter++;
        this.fullName = fullName;
        this.department = departament;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id = " + id + ", ФИО = " + fullName + ", Отдел = " + department + ", ЗП = " + salary;
    }
}
