//Q4


public class Empl 
{
    String name;
    int age;
    
    Empl(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
}

class HR extends Empl 
{
    int Eid;
    double salary;
    
    HR(String name, int age, int Eid, double salary)
    {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }

    void DisplayDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Salary: " + salary);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        HR hr1 = new HR("Alice", 30, 101, 75000.00);
        hr1.DisplayDetails();
	}
}
