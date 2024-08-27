//Q5


abstract class Marks 
{
    double markICP;
    double markDSA;
    double percentage;

    Marks(double markICP, double markDSA) 
    {
        this.markICP = markICP;
        this.markDSA = markDSA;
    }
    abstract void getPercentage();
}

class CSE extends Marks 
{
    double algoDesign;
    CSE(double markICP, double markDSA, double algoDesign) 
    {
        super(markICP, markDSA);
        this.algoDesign = algoDesign;
    }
   
    void getPercentage() 
    {
        percentage = (markICP + markDSA + algoDesign) / 3;
        System.out.println("CSE Student Percentage: " + percentage + "%");
    }
}

class NonCSE extends Marks 
{
    double enggMechanics;
    NonCSE(double markICP, double markDSA, double enggMechanics) 
    {
        super(markICP, markDSA);
        this.enggMechanics = enggMechanics;
    }
    
    void getPercentage() 
    {
        percentage = (markICP + markDSA + enggMechanics) / 3;
        System.out.println("Non-CSE Student Percentage: " + percentage + "%");
    }
}
public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        CSE cseStudent = new CSE(85, 90, 80);
        cseStudent.getPercentage();

        NonCSE nonCSEStudent = new NonCSE(75, 85, 70);
        nonCSEStudent.getPercentage();

	}

}
