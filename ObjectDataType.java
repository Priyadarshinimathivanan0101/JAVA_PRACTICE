import java.util.*;
class Corn
{
    private String cornType;
    private String cornName;
    private double protien;
    private int price;

    public Corn(String cornType, String cornName, double protien, int price)
    {
        this.cornType = cornType;
        this.cornName = cornName;
        this.protien = protien;
        this.price = price;
    }
    public Corn()
    {
    }
    public String getName()
    {
        return this.cornName;
    }
    public int getPrice()
    {
        return this.price;
    }
    public String getType()
    {
        return this.cornType;
    }
    public double getProtien()
    {
        return this.protien;
    }
}
class ObjectDataType
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        Corn[] list = new Corn[4];
        String cornType;
        String cornName;
        double protien;
        int price;
        for(int i=0;i<4;i++)
        {
            cornType = sc.nextLine();
            cornName = sc.nextLine();
            protien = sc.nextDouble();
            sc.nextLine();
            price = sc.nextInt();
            sc.nextLine();
            list[i] = new Corn(cornType, cornName,protien, price);
        }
        String input1 = sc.nextLine();
        int input2 = sc.nextInt();
        double op1 = averageProtienByType(list, input1);
        if(op1 >0.0)
            System.out.println(op1);
        else
            System.out.println("There is no such Corn available");
        Corn[] op2 = sortCornByPrice(list,input2);
        if(op2 != null)
        {
            for(Corn l: op2)
            {
                System.out.println(l.getName());
            }
        }
        else
        {
            System.out.println("No Corn found");
        }
    }
    public static double averageProtienByType(Corn[] list, String input1)
    {
    int co=0;
    double s= 0.0;
    for(Corn c: list)
    {
        if(c.getType().equals(input1))
        {
            co++;
            s=s+c.getProtien();
        }
    }
    return (s/co);
    }

    public static Corn[] sortCornByPrice(Corn[] list, int input2)
    {
        int count=0;
        for(Corn c: list)
        {
            if(c.getPrice() < input2)
                count++;
        }
        Corn[] cl = new Corn[count];
        count=0;
        for(Corn c : list)
        {
            if(c.getPrice() < input2)
            {
                cl[count] = c;
                count++;
            }
        }
        Corn temp = null;
        for(int i=0;i<cl.length;i++)
        {
            for(int j=i+1;j<cl.length;j++)
            {
                if(cl[i].getPrice() < cl[j].getPrice())
                {
                    temp = cl[i];
                    cl[i] = cl[j];
                    cl[j] = temp;
                }
            }
        }
        if(cl.length>0)
        return cl;
        else
        return null;
    }
}
