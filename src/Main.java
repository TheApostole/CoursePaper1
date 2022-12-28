import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //Получение и вывод данных
        getsEmployeeListsAndDataOnThem();
        //Посчёт суммы затрат на зарплаты в месяц
        calculateTheAmountOfSalaryExpenses();
        //Нахождение и вывод сотрудника с минимальной зарплатой
        lookingForAMinimumWage();
        //Нахождение и вывод сотрудника с максимальной зарплатой
        lookingForTheMaximumSalary();
        //Подсчёт среднего значения зарплат
        lookingForAnAverageSalary();
        //Вывод ФИО всех сотрудников
        outputTheFullNameOfAllEmployees();
        //Проиндексирование зарплаты
        indexsalary();
        //Поиск в отделе сотрудника с минимальной зарплатой
        lookingForAMinimumWageEmployeeInTheDepartment(3);
        //Поиск в отделе сотрудника с максимальной зарплатой
        lookingForAMaximumWageEmployeeInTheDepartment(3);
        //Посчёт в отделе суммы затрат на зарплату
        calculateTheAmountOfPayrollExpensesPerDepartment(4);
        //Подсчёт средней зарплаты сотрудников отдела
        calculatingTheAverageSalaryByDepartment(4);
        //Проиндексирование зарплаты сотрудников отдела
        indexTheSalariesOfEmployeesInTheDepartment(1,2);
        //Печать всех сотрудников отдела
        printAllDepartmentEmployees(2);
        //Поиск всех сотрудников с зарплатой меньше числа
        findAllEmployeesWithASalaryLessThanTheNumber(80000);
        //Поиск всех сотрудников с зарплатой больше числа
        findAllEmployeesWithASalaryGreaterThanTheNumber(80000);
    }
    public static Employee[] employee = new Employee[10];
    {
        employee[0] = new Employee("Иванов Иван Иванович", 1, 81050);
        employee[1] = new Employee("Иванов2 Иван2 Иванович2", 5, 41450);
        employee[2] = new Employee("Иванов3 Иван3 Иванович3", 4, 35200);
        employee[3] = new Employee("Иванов4 Иван4 Иванович4", 5, 45600);
        employee[4] = new Employee("Иванов5 Иван5 Иванович5", 2, 50450);
        employee[5] = new Employee("Иванов6 Иван6 Иванович6", 3, 86700);
        employee[6] = new Employee("Иванов7 Иван7 Иванович7", 1, 30400);
        employee[7] = new Employee("Иванов8 Иван8 Иванович8", 3, 100400);
        employee[8] = new Employee("Иванов9 Иван9 Иванович9", 2, 23000);
        employee[9] = new Employee("Иванов10 Иван10 Иванович10", 4, 130050);
    }
    /**
     * Получение и вывод данных
     */
    public static void getsEmployeeListsAndDataOnThem() {
        System.out.println("====================++++++++++++====================");
        System.out.println("Получение и вывод данных:");
        for (Employee value : employee) {
            System.out.println(value);
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Посчёт суммы затрат на зарплату в месяц
     */
    public static void calculateTheAmountOfSalaryExpenses() {
        int sum = 0;
        for (Employee salary : employee) {
            if (salary != null) {
                sum += salary.getSalary();
            }
        }
        System.out.println("Общая сумма зарплат: " + sum);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Поиск сотрудника с минимальной зарплатой
     */
    public static void lookingForAMinimumWage() {
        Employee minSalary = employee[0];
        for (Employee value : employee) {
            if (value != null && value.getSalary() < minSalary.getSalary()) {
                minSalary = value;
            }
        }
        System.out.println("Минимальная зарплата у сотрудника: ");
        System.out.println(minSalary);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Поиск сотрудника с максимальной зарплатой
     */
    public static void lookingForTheMaximumSalary() {
        Employee maxSalary = employee[0];
        for (Employee value : employee) {
            if (value != null && value.getSalary() > maxSalary.getSalary()) {
                maxSalary = value;
            }
        }
        System.out.println("Максимальная зарплата у сотрудника: ");
        System.out.println(maxSalary);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Подсчёт среднего значения зарплаты
     */
    public static void lookingForAnAverageSalary() {
        int averageSalary = 0;
        for (Employee salary : employee) {
            averageSalary += (salary.getSalary() / employee.length);
        }
        System.out.println("Средняя зарплата сотрудников: " + averageSalary);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Вывод ФИО всех сотрудников
     */
    public static void outputTheFullNameOfAllEmployees() {
        System.out.println("Вывод ФИО всех сотрудников:");
        for (Employee employee1 : employee) {
            System.out.println(employee1.getFIO());
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * """Повышенная сложность"""
     * Проиндексирование зарплаты
     */
    public static void indexsalary() {
        System.out.println("Проиндексирование зарплаты:");
        int salary;
        for (Employee indexedSalary : employee) {
            salary = indexedSalary.getSalary() + (indexedSalary.getSalary() / 100 * 7);
            salary++;
            indexedSalary.setSalary(salary);
            System.out.println(indexedSalary);
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Поиск в отделе сотрудника с минимальной зарплатой
     */
    public static void lookingForAMinimumWageEmployeeInTheDepartment(int departmentNumber) {
        int minSalary = Integer.MAX_VALUE;
        Employee minSalaryEmployeeIndex = null;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && departmentNumber == employee[i].getDepartment()) {
                if (employee[i].getSalary() < minSalary){
                    minSalary = employee[i].getSalary();
                    minSalaryEmployeeIndex = employee[i];
                }
            }
        }
        System.out.println("В отделе № " + departmentNumber + " работник с минимальной зарплатой: ");
        System.out.println(minSalaryEmployeeIndex);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Поиск в отделе сотрудника с максимальной зарплатой
     */
    public static void lookingForAMaximumWageEmployeeInTheDepartment(int departmentNumber) {
        int maxSalary = Integer.MIN_VALUE;
        Employee maxSalaryEmployeeIndex = null;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && departmentNumber == employee[i].getDepartment()) {
                if (employee[i].getSalary() > maxSalary){
                    maxSalary = employee[i].getSalary();
                    maxSalaryEmployeeIndex = employee[i];
                }
            }
        }
        System.out.println("В отделе № " + departmentNumber + " работник с максимальной зарплатой: ");
        System.out.println(maxSalaryEmployeeIndex);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Посчёт в отделе суммы затрат на зарплату
     */
    public static void calculateTheAmountOfPayrollExpensesPerDepartment(int departmentNumber){
        int sumPerDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && departmentNumber == employee[i].getDepartment()) {
                sumPerDepartment += employee[i].getSalary();
            }
        }
        System.out.println("Сумма зарплат в отделе № " + departmentNumber + " составляет: " + sumPerDepartment);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Подсчёт средней зарплаты сотрудников отдела
     */
    public static void calculatingTheAverageSalaryByDepartment(int departmentNumber) {
        int averageSalaryOfTheDepartment = 0;
        int numberOfEmployeesInTheDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && departmentNumber == employee[i].getDepartment()) {
                numberOfEmployeesInTheDepartment++;
                averageSalaryOfTheDepartment += employee[i].getSalary();
            }
        }
        averageSalaryOfTheDepartment = averageSalaryOfTheDepartment / numberOfEmployeesInTheDepartment;
        System.out.println("Средняя зарплата сотрудников отдела № " + departmentNumber + " составляет: " + averageSalaryOfTheDepartment);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Проиндексирование зарплаты сотрудников отдела
     */
    public static void indexTheSalariesOfEmployeesInTheDepartment (int departmentNumber, int prosent) {
        System.out.println("Проиндексирование зарплаты сотрудников отдела № " + departmentNumber + ":");
        int salary = 0;
        Employee salaryEmployeeIndex = null;
        for (int i = 0; i < employee.length ; i++) {
            if(employee[i] != null && departmentNumber == employee[i].getDepartment()) {
                salary = employee[i].getSalary() + (employee[i].getSalary() / 100 * prosent);
                salaryEmployeeIndex = employee[i];
                salaryEmployeeIndex.setSalary(salary);
                System.out.println(salaryEmployeeIndex);
            }
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Печать всех сотрудников отдела
     */
    public static void printAllDepartmentEmployees (int departmentNumber) {
        System.out.println("Печать всех сотрудников отдела № " + departmentNumber + ":");
        for (int i = 0; i < employee.length ; i++) {
            if (employee[i] != null && departmentNumber == employee[i].getDepartment()) {
                System.out.println("Id: " + employee[i].getId() + " | " + "ФИО: " + employee[i].getFIO() + " | " + "Зарплата: " + employee[i].getSalary());

            }
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Поиск всех сотрудников с зарплатой меньше числа
     */
    public static void findAllEmployeesWithASalaryLessThanTheNumber(int number){
        System.out.println("Поиск всех сотрудников с зарплатой меньше числа " +  number + ":");
        for (Employee value : employee) {
            if (value != null && value.getSalary() < number) {
                System.out.println("Id: " + value.getId() + " | " + "ФИО: " + value.getFIO() + " | " + "Зарплата: " + value.getSalary());
            }
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Поиск всех сотрудников с зарплатой больше числа
     */
    public static void findAllEmployeesWithASalaryGreaterThanTheNumber (int number){
        System.out.println("Поиск всех сотрудников с зарплатой больше или равно числу " +  number + ":");
        for (Employee value : employee) {
            if (value != null && value.getSalary() >= number) {
                System.out.println("Id: " + value.getId() + " | " + "ФИО: " + value.getFIO() + " | " + "Зарплата: " + value.getSalary());
            }
        }
        System.out.println("====================++++++++++++====================");
    }
}
