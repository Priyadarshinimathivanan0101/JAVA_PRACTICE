import java.util.*;
public class TicketBooking {
    static int total= 40;
    public static void main(String[] arg)
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. See available tickets");
        System.out.println("2. Book ticket");
        System.out.println("3. Exit");
        int n = sc.nextInt();
        sc.nextLine();
        while(n<4 && n>0)
        {
            if(n==1)
            {
                System.out.println("Number of available tickets  = " + available());
            }
            else if(n==2)
            {
                System.out.println(" Enter Total Number of tickets ");
                count = sc.nextInt();
                sc.nextLine();
                bookTicket(count);
            }
            else if(n==3)
            {
                System.out.println("Thanks for using.");
                break;
            }
            System.out.println("1. See available tickets");
            System.out.println("2. Book ticket");
            System.out.println("3. Exit");
            n = sc.nextInt();
            sc.nextLine();
        }

    }
    public static int available()
    {
        return total;
    }
    public static void bookTicket(int count)
    {
        total = total -count;
        System.out.println( count + " ticket/tickets booked");
    }

    
}
