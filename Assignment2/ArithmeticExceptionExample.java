public class ArithmeticExceptionExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            int result = 10 / 0; 
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}











