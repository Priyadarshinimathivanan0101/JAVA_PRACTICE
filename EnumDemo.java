
package enumdemo;
import java.util.*;
enum Size
{
    SMALL, MEDIUM, LARGE, EXTRALARGE
}
class PizzaShop
{
    Size pizzaSize;
    public PizzaShop(Size pizzaSize)
    {
        this.pizzaSize = pizzaSize;
    }
    public void orderPizza()
    {
        switch(pizzaSize)
        {
            case SMALL : System.out.println("Small Size Pizza is ordered");
            break;
            case MEDIUM : System.out.println("Medium Size Pizza is ordered");
            break;
            case LARGE : System.out.println("Large Size Pizza is ordered");
            break;
            case EXTRALARGE : System.out.println("Extra Large Size Pizza is ordered");
            break;
        }
    }
}
public class EnumDemo {
    
    public static void main(String[] args) {
        PizzaShop pizza = new PizzaShop(Size.MEDIUM);
        
        pizza.orderPizza();
    }
    
}
