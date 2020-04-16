import employeemanagement.services.Employee;
import employeemanagement.services.EmployeeServiceImpl;
import employeemanagement.services.EmployeeServiceImplService;

public class Main {

	public static void main(String[] args) {
		
		EmployeeServiceImpl webservice= new EmployeeServiceImplService().getEmployeeServiceImplPort();
		Employee employee =  webservice.getEmployeeById("1");
		
		System.out.println(employee.getName());
	}

}
