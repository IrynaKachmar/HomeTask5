package emploee;

import java.util.Comparator;

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
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setSalary(Float salary) {
        this.salary = salary;
    }
    
    public Float getSalary() {
        return salary;
    }
    
    public int compareTo(emploee other) {
        return name.compareTo(other.name);
    }
    
    public String toString() {
        return "Name: " + this.name + "\t Position: " + this.position + "\t Salary: " + this.salary;
    }

    public static Comparator<emploee> salaryComparator  = new Comparator<emploee>() {
        public int compare(emploee salary1, emploee salary2) {
            Float value1 = salary1.getSalary();
            Float value2 = salary2.getSalary();
            
            return value1.compareTo(value2);
        }
    };

    public static Comparator<emploee> positionComparator  = new Comparator<emploee>() {
        public int compare(emploee position1, emploee position2) {
            String value1 = position1.getPosition();
            String value2 = position2.getPosition();
            
            return value1.compareTo(value2);
        }
    };

}
