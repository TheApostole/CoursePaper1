public class Employee {
    private String fIO;
    private int department;
    private int salary;
    private static long counter;
    private long id;
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
    public static long getCounter() {
        return counter;
    }
    public long getId() {
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
    public static void setCounter(long counter) {
        Employee.counter = counter;
    }
    public void setId(long id) {
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
        return "Id: " + id + " ФИО: " + fIO + " Отдел: " + department + " Зарплата: " + salary;
    }
}
