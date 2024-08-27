//Q1

import java.util.Scanner;
public class Employee 
{
	 String name;
	 double salary;
	 int age;

	 void setData(String name, double salary, int age) 
	 {
		 this.name = name;
	     this.salary = salary;
	     this.age = age;
	 }

	 void displayData() 
	 {
	      System.out.println("Name: " + name);
	      System.out.println("Salary: " + salary);
	      System.out.println("Age: " + age);
	 }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 Employee employee1 = new Employee();
	     employee1.name = "Joseph";
	     employee1.salary = 65784.50;
	     employee1.age = 25;

	        
	     Employee employee2 = new Employee();
	     Scanner scanner = new Scanner(System.in);
	        
	     System.out.print("Enter your name: ");
	     String name = scanner.nextLine();
	        
	     System.out.print("Enter your age: ");
	     int age = scanner.nextInt();
	        
	     System.out.print("Enter your salary: ");
	     double salary = scanner.nextDouble();
	        
	     employee2.setData(name, salary, age);
 
	     System.out.println("\nEmployee 1 Data:");
	     employee1.displayData();

	     System.out.println("\nEmployee 2 Data:");
	     employee2.displayData();

	       
	     if (employee1.age > employee2.age) 
	     {
	            System.out.println("\n" + employee1.name + " is older than " + employee2.name + ".");
	     } 
	     else if (employee1.age < employee2.age) 
	     {
	            System.out.println("\n" + employee2.name + " is older than " + employee1.name + ".");
	     } 
	     else 
	     {
	            System.out.println("\n" + employee1.name + " and " + employee2.name + " are of the same age.");
	     }

	     scanner.close();
	}
}
