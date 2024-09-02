public class NulPointerExceptionExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            String str = null;
            int length = str.length(); 
        } 
        catch (NullPointerException e)
        {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
}
