import java.util.ArrayList;
import java.util.List;

public class ListExample 
{
    public static void main(String[] args) 
    {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); 

        for (String fruit : fruits) 
        {
            System.out.println(fruit);
        }
    }
}









