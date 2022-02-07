import java.util.*;
public class PANNumberGeneration {
    public static void main(String arg[])
    {
        PANNumberGeneration obj = new PANNumberGeneration();
        String lastName;
        char status;
        Integer number =1;
        char alphabet ='A';
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Generate Pan  ");
        System.out.println("2. Exit");
        System.out.print("Enter the option :  ");
        int n= sc.nextInt();
        sc.nextLine();
        while(n==1)
        {
            System.out.println();
            System.out.print("Enter LastName :");
            lastName = sc.nextLine();
            
            System.out.print("Enter Status :");
            status = sc.next().charAt(0);
            sc.nextLine();
            System.out.println(obj.generatePan(number,lastName,status,alphabet));
            number = number +1;
            alphabet++;
            System.out.println("1. Generate Pan  ");
            System.out.println("2. Exit");
            System.out.print("Enter the option :  ");
            n= sc.nextInt();
            sc.nextLine();
        }
        
    }
    public String generatePan(Integer number,String lastName, char status,char alphabet)
    {
        String num= Integer.toString(number);
        
        String generated = "";
        generated = generated +alphabet;
        generated = generated+ status;
        generated = generated + lastName.charAt(0); 
        generated = generated+ num;
        return generated;
    }
}
