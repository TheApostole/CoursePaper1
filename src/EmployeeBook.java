import java.util.Arrays;

public class EmployeeBook {
    private static Employee[] employee = new Employee[10];
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
     * Вывод данных
     */
    public void getsEmployeeListsAndDataOnThem() {
        System.out.println("Вывод данных:");
        for (Employee value : employee) {
            System.out.println(value);
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Посчёт суммы затрат на заработную плату в месяц
     */
    public void calculateTheAmountOfSalaryExpenses() {
        int sum = 0;
        for (Employee salary : employee) {
            if (salary != null) {
                sum += salary.getSalary();
            }
        }
        System.out.println("Общая сумма заработных плат: " + sum);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Поиск сотрудника с минимальной заработной платой
     */
    public void lookingForAMinimumWage() {
        Employee minSalary = employee[0];
        for (Employee value : employee) {
            if (value != null && value.getSalary() < minSalary.getSalary()) {
                minSalary = value;
            }
        }
        System.out.println("Сотрудник с минимальной заработной платой: ");
        System.out.println(minSalary);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Поиск сотрудника с максимальной заработной платой
     */
    public void lookingForTheMaximumSalary() {
        Employee maxSalary = employee[0];
        for (Employee value : employee) {
            if (value != null && value.getSalary() > maxSalary.getSalary()) {
                maxSalary = value;
            }
        }
        System.out.println("Сотрудник с максимальной заработной платой: ");
        System.out.println(maxSalary);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Подсчёт среднего значения заработной платы
     */
    public void lookingForAnAverageSalary() {
        int averageSalary = 0;
        for (Employee salary : employee) {
            averageSalary += (salary.getSalary() / employee.length);
        }
        System.out.println("Средняя заработная плата сотрудников: " + averageSalary);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Вывод ФИО всех сотрудников
     */
    public void outputTheFullNameOfAllEmployees() {
        System.out.println("ФИО всех сотрудников:");
        for (Employee employee1 : employee) {
            System.out.println(employee1.getFIO());
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * """Повышенная сложность"""
     * Проиндексирование заработной платы
     */
    public void indexsalary() {
        System.out.println("Проиндексирование заработной платы сотрудников:");
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
     * Поиск в отделе сотрудника с минимальной заработной платой
     */
    public void lookingForAMinimumWageEmployeeInTheDepartment(int departmentNumber) {
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
        System.out.println("В отделе № " + departmentNumber + " работник с минимальной заработной платой: ");
        System.out.println(minSalaryEmployeeIndex);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Поиск в отделе сотрудника с максимальной заработной платой
     */
    public void lookingForAMaximumWageEmployeeInTheDepartment(int departmentNumber) {
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
        System.out.println("В отделе № " + departmentNumber + " работник с максимальной заработной платой: ");
        System.out.println(maxSalaryEmployeeIndex);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Посчёт в отделе суммы затрат на зарплату
     */
    public void calculateTheAmountOfPayrollExpensesPerDepartment(int departmentNumber){
        int sumPerDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && departmentNumber == employee[i].getDepartment()) {
                sumPerDepartment += employee[i].getSalary();
            }
        }
        System.out.println("Сумма заработных плат в отделе № " + departmentNumber + " составляет: " + sumPerDepartment);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Подсчёт средней заработной платы сотрудников отдела
     */
    public void calculatingTheAverageSalaryByDepartment(int departmentNumber) {
        int averageSalaryOfTheDepartment = 0;
        int numberOfEmployeesInTheDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && departmentNumber == employee[i].getDepartment()) {
                numberOfEmployeesInTheDepartment++;
                averageSalaryOfTheDepartment += employee[i].getSalary();
            }
        }
        averageSalaryOfTheDepartment = averageSalaryOfTheDepartment / numberOfEmployeesInTheDepartment;
        System.out.println("Средняя заработная плата сотрудников отдела № " + departmentNumber + " составляет: " + averageSalaryOfTheDepartment);
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Проиндексирование зарплаты сотрудников отдела
     */
    public void indexTheSalariesOfEmployeesInTheDepartment (int departmentNumber, int prosent) {
        System.out.println("Проиндексирование заработной платы сотрудников отдела № " + departmentNumber + ":");
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
    public void printAllDepartmentEmployees (int departmentNumber) {
        System.out.println("Все сотрудники отдела № " + departmentNumber + ":");
        for (int i = 0; i < employee.length ; i++) {
            if (employee[i] != null && departmentNumber == employee[i].getDepartment()) {
                System.out.println("Id: " + employee[i].getId() + " | " + "ФИО: " + employee[i].getFIO() + " | " + "Зарплата: " + employee[i].getSalary());

            }
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Поиск всех сотрудников с заработной платой меньше числа
     */
    public void findAllEmployeesWithASalaryLessThanTheNumber(int number){
        System.out.println("Сотрудники с заработной платой меньше " +  number + ":");
        for (Employee value : employee) {
            if (value != null && value.getSalary() < number) {
                System.out.println("Id: " + value.getId() + " | " + "ФИО: " + value.getFIO() + " | " + "Зарплата: " + value.getSalary());
            }
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Поиск всех сотрудников с заработной платой больше числа
     */
    public void findAllEmployeesWithASalaryGreaterThanTheNumber (int number){
        System.out.println("Сотрудники с заработной платой больше или равной " +  number + ":");
        for (Employee value : employee) {
            if (value != null && value.getSalary() >= number) {
                System.out.println("Id: " + value.getId() + " | " + "ФИО: " + value.getFIO() + " | " + "Зарплата: " + value.getSalary());
            }
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * """Очень сложно"""
     * Добавление нового сотрудника
     */
    public void addNewEmployee(Employee worker) {
        System.out.println("Добавление нового сотрудника:");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = worker;
                System.out.println(employee[i]);
            } else {
                System.out.println("Свободных мест нет");
            }
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Удаление сотрудника
     */
    public void deleteAnEmployee(long index, String worker) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && worker.equals(employee[i].getFIO()) && index == employee[i].getId()) {
                employee[i] = null;
                return;
            }
        }
    }
    /**
     * Изменение данных о сотруднике
     */
    public void findAndEditData(String worker, int department, int salary) {
        System.out.println("Изменение данных о сотруднике:");
        for (Employee item : employee) {
            if (item != null && worker.equals(item.getFIO())) {
                item.setDepartment(department);
                item.setSalary(salary);
                System.out.println(item);
            }
        }
        System.out.println("====================++++++++++++====================");
    }
    /**
     * Вывод сотрудников по отделам
     */
    public  void printAllDepartmentsWithEmployees(int department) {
        for (Employee worker : employee) {
            if(worker != null && department == worker.getDepartment()) {
                System.out.println(worker);
            }
        }
    }
    public  void printAllEmployeesInTheDepartment() {
        int[] departments = extractDepartmentNumber();
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] != 0) {
                System.out.println("В отделе № " + departments[i] + " работают следующие сотрудники: ");
                printAllDepartmentsWithEmployees(i);
            }
        }
    }
    public  int[] extractDepartmentNumber () {
        int[] departments = new int[employee.length];
        int employeeNumber = 0;
        for (int i = 0; i < employee.length - 1; i++) {
            if (employee[i] != null) {
                assert employee[i] != null;
                departments[employeeNumber] = employee[i].getDepartment();
                employeeNumber++;
            }
        }
        Arrays.sort(departments);
        int cell = 0;
        for (int i = 0; i < departments.length; i++) {
            if (i == 0 || departments[i] != departments[i - 1]) {
                departments[cell++] = departments[i];
            }
        }
        return Arrays.copyOf(departments, cell);
    }
}
