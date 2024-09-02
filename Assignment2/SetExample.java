import java.util.HashSet;
import java.util.Set;

public class SetExample 
{
    public static void main(String[] args) 
    {
        Set<String> animals = new HashSet<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Cat");

        for (String animal : animals) 
        {
            System.out.println(animal);
        }
    }
}