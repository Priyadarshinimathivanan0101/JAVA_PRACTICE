/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] arg)
    {
        List<String> arlTest = new ArrayList<String>();
        System.out.println("Size of ArrayList at creation: " + arlTest.size());//size method
        arlTest.add("Z");
        arlTest.add("O");
        arlTest.add("H");
        arlTest.add("O");
        System.out.println("Size of ArrayList after adding elements: " + arlTest.size());
        System.out.println("List of all elements: " + arlTest);
        arlTest.remove("H");//remove by element
        System.out.println("After removing one element: " + arlTest);
        arlTest.remove(2); //remove by index
        System.out.println("After removing element by index: " + arlTest);
        System.out.println("List of elements: " + arlTest);
        System.out.println(arlTest.contains("K")); // contains method
        
    }
    
}
