//Q3


public class Deposit 
{
	
    Long Principal;
    Integer Time;
    Double Rate;
    Double TotalAmt;

    
    Deposit() 
    {
        this.Principal = 0L;
        this.Time = 0;
        this.Rate = 0.0;
        this.TotalAmt = 0.0;
    }

   
    Deposit(Long Principal, Integer Time, Double Rate) 
    {
        this.Principal = Principal;
        this.Time = Time;
        this.Rate = Rate;
        calcAmt();
    }

    
    Deposit(Long Principal, Integer Time) 
    {
        this.Principal = Principal;
        this.Time = Time;
        this.Rate = 0.0; 
        this.TotalAmt = 0.0;
    }   
    Deposit(Long Principal, Double Rate) 
    {
        this.Principal = Principal;
        this.Time = 0; 
        this.Rate = Rate;
        this.TotalAmt = 0.0;
    }
    void calcAmt() 
    {
        this.TotalAmt = Principal + (Principal * Rate * Time) / 100;
    }
    
    void display() 
    {
        System.out.println("Principal: " + Principal);
        System.out.println("Time: " + Time);
        System.out.println("Rate: " + Rate);
        System.out.println("Total Amount: " + TotalAmt);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Deposit d1 = new Deposit();
        Deposit d2 = new Deposit(10000L, 5, 5.5);
        Deposit d3 = new Deposit(20000L, 3);
        Deposit d4 = new Deposit(15000L, 4.5);

        d3.calcAmt();
        d4.calcAmt();

        System.out.println("Deposit 1 Details:");
        d1.display();
        System.out.println();

        System.out.println("Deposit 2 Details:");
        d2.display();
        System.out.println();

        System.out.println("Deposit 3 Details:");
        d3.display();
        System.out.println();

        System.out.println("Deposit 4 Details:");
        d4.display();
	}
}