public class MVCPatternDemo {
    public static void main(String[] args) {

        Employee employeeModel = retriveEmployeeFromDatabase();

        EmployeeView employeeView = new EmployeeView();

        EmployeeController employeeController = new EmployeeController(employeeModel, employeeView);

        employeeModel.setFirstName("Chander Kumar");
        employeeModel.setSalary((float) 5000.00);
        employeeController.updateView();


    }

    private static Employee retriveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setEmployeeID(002);
        employee.setFirstName("Narendar Kumar");
        employee.setLastName("");
        employee.setGender("Male");
        employee.setHiredDate("10/jan/2021");
        employee.setSalary((float) 20000.00);
        return employee;
    }
}
