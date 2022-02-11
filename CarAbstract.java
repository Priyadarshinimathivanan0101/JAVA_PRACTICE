abstract class Car{
    Car(){
        
    }
    abstract void on();
    abstract void run();
    abstract void stop();
    abstract void off();
    void horn()
    {
        System.out.println("Sound horn.....");
    }
}
class Functionality extends Car
{
    void on()
    {
        System.out.println("Car started.....");
    }
    void run()
    {
        System.out.println("Car movng.....");
    }
    void stop()
    {
        System.out.println("Car stopped.....");
    }
    void off()
    {
        System.out.println("Car turned Off.....");
    }
}
public class CarAbstract {
    public static void main(String[] arg)
    {

        Car obj = new Functionality();
        obj.on();
        obj.run();
        obj.horn();
        obj.stop();
        obj.off();
    }
    
}
