interface Keyboard 
{
    void type();
}


class DellKeyboard implements Keyboard 
{
   
    public void type() 
    {
        System.out.println("Typing on Dell Keyboard");
    }
}


class LenovoKeyboard implements Keyboard {
   
    public void type() {
        System.out.println("Typing on Lenovo Keyboard");
    }
}


class Computer {
    public void keyboardUsed(Keyboard keyboard) {
        keyboard.type();
    }
}


public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Keyboard dellKeyboard = new DellKeyboard();
        Keyboard lenovoKeyboard = new LenovoKeyboard();

        computer.keyboardUsed(dellKeyboard);  
        computer.keyboardUsed(lenovoKeyboard); 
    }
}