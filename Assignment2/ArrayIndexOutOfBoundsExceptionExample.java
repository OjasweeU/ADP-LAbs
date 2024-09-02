public class ArrayIndexOutOfBoundsExceptionExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            int[] numbers = {1, 2, 3};
            int value = numbers[5]; 
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
