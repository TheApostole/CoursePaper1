public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Иванович", 1, 39500);
        employee[1] = new Employee("Иванов2 Иван2 Иванович2", 5, 41450);
        employee[2] = new Employee("Иванов3 Иван3 Иванович3", 4, 40200);
        employee[3] = new Employee("Иванов4 Иван4 Иванович4", 5, 45600);
        employee[4] = new Employee("Иванов5 Иван5 Иванович5", 3, 50450);
        employee[5] = new Employee("Иванов6 Иван6 Иванович6", 3, 109700);
        employee[6] = new Employee("Иванов7 Иван7 Иванович7", 1, 70400);
        employee[7] = new Employee("Иванов8 Иван8 Иванович8", 2, 108400);
        employee[8] = new Employee("Иванов9 Иван9 Иванович9", 2, 21000);
        employee[9] = new Employee("Иванов10 Иван10 Иванович10", 4, 37050);
        //Получение и вывод данных
        getsEmployeeListsAndDataOnThem(employee);
        //Посчёт суммы затрат на зарплаты в месяц
        calculatingTheAmountOfSalaryCosts(employee);
        //Нахождение сотрудника с минимальной зарплатой
        lookingForAMinimumWage(employee);
        //Нахождение сотрудника с максимальной зарплатой
        lookingForTheMaximumSalary(employee);
        //Подсчёт среднего значения зарплат
        lookingForAnAverageSalary(employee);
        //Вывод ФИО всех сотрудников
        outputTheFullNameOfAllEmployees(employee);
    }
    /**
     * Получение и вывод данных
     */
    public static void getsEmployeeListsAndDataOnThem(Employee[] employee) {
        for (Employee employee1 : employee) {
            System.out.println(employee1);
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Посчёт суммы затрат на зарплаты в месяц
     */
    public static void calculatingTheAmountOfSalaryCosts(Employee[] employee) {
        int sum = 0;
        for (Employee salary : employee) {
            if (salary != null) {
                sum += salary.getSalary();
            }
        }
        System.out.println("Сумма зарплат: " + sum);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Нахождение сотрудника с минимальной зарплатой
     */
    public static void lookingForAMinimumWage(Employee[] employee){
        Employee minSalary = employee[0];
        for (Employee value : employee) {
            if (value != null && value.getSalary() < minSalary.getSalary()) {
                minSalary = value;
            }
        }
        System.out.println(minSalary);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Нахождение сотрудника с максимальной зарплатой
     */
    public static void lookingForTheMaximumSalary(Employee[] employee){
        Employee maxSalary = employee[0];
        for (Employee value : employee) {
            if (value != null && value.getSalary() > maxSalary.getSalary()) {
                maxSalary = value;
            }
        }
        System.out.println(maxSalary);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Подсчёт среднего значения зарплат
     */
    public static void lookingForAnAverageSalary(Employee[] employee) {
        int sum = 0;
        for (Employee salary : employee) {
            sum += (salary.getSalary() / employee.length);
        }
        System.out.println("Средняя зарплата сотрудников: " + sum);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Вывод ФИО всех сотрудников
     */
    public static void outputTheFullNameOfAllEmployees(Employee[] employee) {
        for (Employee employee1 : employee) {
            System.out.println(employee1.getFIO());
        }
    }
}