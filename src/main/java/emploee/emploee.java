package emploee;

public class emploee implements Comparable<emploee> {
	private String name;
	private String position;
	private float salary;

	emploee(String name, String  position,	String salary){
		this.name = name;
		this.position = position;
		this.salary = Float.valueOf(salary);
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getName() {
	    return name;
	}

	public int compareTo(emploee other) {
        return name.compareTo(other.name);
	}

	public String toString() {
		return "Name: "+this.name+"\t Position: "+this.position+"\t Salary: "+this.salary;
	}

}
