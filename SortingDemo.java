/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

/**
 *
 * @author priya-pt5111
 */
import java.util.*;
public class SortingDemo {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Hall> list = new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        String name;
        String contactNumber;
        double costPerDay;
        String ownerName;
        for(int i=0;i<n;i++)
        {
            name = sc.nextLine();
            contactNumber = sc.nextLine();
            costPerDay =sc.nextDouble();
            sc.nextLine();
            ownerName =sc.nextLine();
            list.add(new Hall(costPerDay, name, contactNumber, ownerName));
        }
        Collections.sort(list);
        for(int i=0;i<n;i++)
        {
                System.out.println(list.get(i));
        }
    }
}
class Hall implements Comparable<Hall>
{
    private String name;
    private String contactNumber;
    private double costPerDay;
    private String ownerName;
    public Hall(double costPerDay, String name, String contactNumber, String ownerName)
    {
        super();
        this.name = name;
        this.costPerDay = costPerDay;
        this.contactNumber = contactNumber;
        this.ownerName = ownerName;
    }
    @Override
    public int compareTo(Hall hall)
    {
        if(this.costPerDay>hall.costPerDay)
            return 1;
        else if(this.costPerDay<hall.costPerDay)
            return -1;
        else
            return 0;
    }
    @Override
    public String toString()
    {
        return String.format("%s %s %s %s",name,contactNumber,costPerDay,ownerName);
    }

}

