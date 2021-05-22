public class EmployeeView
{
    public void EmployeeDetails(int employeeID, String firstName, String lastName, String gender, String hiredDate, Float salary) {
        System.out.println("Employee");
        System.out.println("Employee Id: " + employeeID);
        System.out.println("Employee Name: " + firstName + " " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Hired Date: " + hiredDate);
        System.out.println("Salary: " + salary);
    }
}
