import java.util.*;
class Account
{
   private String name;
   private long amount;
   Account(String name, long amount)
   {
      this.name = name;
      setAmount(amount);
   }
   void deposit(long amount)
   {
      this.amount += amount;
   }
   String getName()
   {
      return name;
   }
   long getAmount()
   {
      return amount;
   }
   void setAmount(long amount)
   {
      this.amount = amount;
   }
}
class SavingsAccount extends Account
{
   SavingsAccount(long amount)
   {
      super("savings", amount);
   }
}
class CurrentAccount extends Account
{
   CurrentAccount(long amount)
   {
      super("current", amount);
   }
   void withdraw(long amount)
   {
      setAmount(getAmount() - amount);
   }
}
public class AccountDetails {
    public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial Amount ");
        long initialAmount = sc.nextLong();
        sc.nextLine();
        System.out.println("1. Saving Account ");
        System.out.println("2. Current Account ");
        System.out.println("Enter the option ");
        int option = sc.nextInt();
        sc.nextLine();
        if(option ==1 )
        {
            SavingsAccount sa = new SavingsAccount(initialAmount);
            System.out.println("Account name: " + sa.getName());
            System.out.println("Initial amount: " + sa.getAmount());
            System.out.println("Enter the amount to be deposited");
            long depo = sc.nextLong();
            sc.nextLine();
            sa.deposit(depo);
            System.out.println("New amount after deposit: " + sa.getAmount());
        }
        else if(option == 2)
        {
            CurrentAccount ca = new CurrentAccount(initialAmount);
            System.out.println("Account name: " + ca.getName());
            System.out.println("Initial amount: " + ca.getAmount());
            System.out.println("Enter the amount to be deposited");
            long depo = sc.nextLong();
            sc.nextLine();
            ca.deposit(depo);
            System.out.println("new amount after deposit: " + ca.getAmount());
            System.out.println("Enter the amount to be withdraw");
            long wid = sc.nextLong();
            sc.nextLine();
            ca.withdraw(wid);
            System.out.println("new amount after withdrawal: " + ca.getAmount());
        }
   }
}
