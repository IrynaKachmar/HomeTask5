package emploee;

public class emploee {
	private String name;
	private String position;
	private float salary;
	
	emploee(String name, String  position,	String salary){
		this.name = name;
		this.position = position;
		this.salary = Float.valueOf(salary);
	}
	
	public String toString() {
		return "Name: "+this.name+"\t Position: "+this.position+"\t Salary: "+this.salary;
	}
	
}
