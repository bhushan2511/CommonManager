package CommonManager;

import java.util.List;
import java.util.Stack;

public class Employee {
	
	private String name;
	private List<Employee> reportees;
	private Employee manager;
	
	
	public Employee(String name, List<Employee> reportees, Employee manager) {
		super();
		this.setName(name);
		this.setReportees(reportees);
		this.manager = manager;
	}
			
	public List<Employee> getReportees() {
		return reportees;
	}

	public void setReportees(List<Employee> reportees) {
		this.reportees = reportees;
	}

	//O(log n) and memory also O(log n)
	public static Employee closestManager(Employee e1, Employee e2)
	{
		
		Stack<Employee> s1= new Stack<Employee>();
		Stack<Employee> s2= new Stack<Employee>();
		Employee commonManager=null;
		
		while(e1!=null || e2 !=null)
		{
			if(e1!=null)
			{
				s1.push(e1);
				e1=e1.manager;
			}
			
			if(e2!=null)
			{
				s2.push(e2);
				e2=e2.manager;				
						
			}
		}
		
		while(!s1.isEmpty() && !s2.isEmpty())
		{
			if(s1.peek()!=s2.peek())
			{
				break;
			}
			
			commonManager=s1.pop();
			s2.pop();
		}
		
		return commonManager;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public  void addReprotee(Employee e) {		 
		  reportees.add(e);
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}
	
	
	

}
