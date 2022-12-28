import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        //Получение и вывод данных
        employeeBook.getsEmployeeListsAndDataOnThem();
        //Посчёт суммы затрат на зарплаты в месяц
        employeeBook.calculateTheAmountOfSalaryExpenses();
        //Нахождение и вывод сотрудника с минимальной зарплатой
        employeeBook.lookingForAMinimumWage();
        //Нахождение и вывод сотрудника с максимальной зарплатой
        employeeBook.lookingForTheMaximumSalary();
        //Подсчёт среднего значения зарплат
        employeeBook.lookingForAnAverageSalary();
        //Вывод ФИО всех сотрудников
        employeeBook.outputTheFullNameOfAllEmployees();
        //Проиндексирование зарплаты
        employeeBook.indexsalary();
        //Поиск в отделе сотрудника с минимальной зарплатой
        employeeBook.lookingForAMinimumWageEmployeeInTheDepartment(3);
        //Поиск в отделе сотрудника с максимальной зарплатой
        employeeBook.lookingForAMaximumWageEmployeeInTheDepartment(3);
        //Посчёт в отделе суммы затрат на зарплату
        employeeBook.calculateTheAmountOfPayrollExpensesPerDepartment(4);
        //Подсчёт средней зарплаты сотрудников отдела
        employeeBook.calculatingTheAverageSalaryByDepartment(4);
        //Проиндексирование зарплаты сотрудников отдела
        employeeBook.indexTheSalariesOfEmployeesInTheDepartment(1,2);
        //Печать всех сотрудников отдела
        employeeBook.printAllDepartmentEmployees(2);
        //Поиск всех сотрудников с зарплатой меньше числа
        employeeBook.findAllEmployeesWithASalaryLessThanTheNumber(80000);
        //Поиск всех сотрудников с зарплатой больше числа
        employeeBook.findAllEmployeesWithASalaryGreaterThanTheNumber(80000);
        //Удаление сотрудника
        employeeBook.deleteAnEmployee(2, "Иванов2 Иван2 Иванович2");
        employeeBook.getsEmployeeListsAndDataOnThem();
        //Добавление нового сотрудника
        employeeBook.addNewEmployee(new Employee("Иванов11 Иван11 Иванович11", 2, 95500));
        //Изменение данных о сотруднике
        employeeBook.findAndEditData("Иванов Иван Иванович",2, 20000);
        //Вывод сотрудников по отделам
        employeeBook.printAllEmployeesInTheDepartment();
    }
}
