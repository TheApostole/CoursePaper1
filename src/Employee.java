import java.util.Objects;

public class Employee {
    private String fIO;
    private int department;
    private int salary;
    private static int counter;
    private int id;
    /**
     * Геттеры
     */
    public String getFIO() {
        return fIO;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public static int getCounter() {
        return counter;
    }
    public int getId() {
        return id;
    }
    /**
     * Сеттеры
     */
    public void setfIO(String fIO) {
        this.fIO = fIO;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public static void setCounter(int counter) {
        Employee.counter = counter;
    }
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Конструктор
     */
    public Employee(String fIO, int department, int salary) {
        this.fIO = fIO;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }
    /**
     * Метод toString()
     */
    @Override
    public String toString() {
        return "Id: " + id + " | " + "ФИО: " + fIO + " | " + "Отдел: " + department + " | " + "Зарплата: " + salary;
    }
    /**
     * Метод equals()
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && fIO.equals(employee.fIO);
    }
    /**
     * Метод hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(fIO, department, salary, id);
    }

}
