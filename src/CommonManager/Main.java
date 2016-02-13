package CommonManager;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		Employee bill=new Employee("bill",new ArrayList<Employee>(), null);
		Employee nag=new Employee("nag",new ArrayList<Employee>(), bill);
		Employee vysh=new Employee("vysh",new ArrayList<Employee>(), bill);
		Employee bhavana=new Employee("bhava",new ArrayList<Employee>(), nag);
		Employee suprith=new Employee("suprith",new ArrayList<Employee>(), nag);
		Employee madhu=new Employee("madhu",new ArrayList<Employee>(), vysh);
		Employee niranjan=new Employee("niranjan",new ArrayList<Employee>(), vysh);
		Employee hegde=new Employee("Hegde",new ArrayList<Employee>(), suprith);
		Employee om=new Employee("Om",new ArrayList<Employee>(), suprith);
		
		
		bill.addReprotee(nag);
		bill.addReprotee(vysh);
		nag.addReprotee(bhavana);
		nag.addReprotee(suprith);
		vysh.addReprotee(madhu);
		vysh.addReprotee(niranjan);
		suprith.addReprotee(hegde);
		suprith.addReprotee(om);
		
		Employee e = Employee.closestManager(niranjan, bhavana);
		
		System.out.println("Common manager name is : "+ e.getName());
		
		
		
		

	}

}
