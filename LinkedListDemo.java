/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;
import java.util.*;
/**
 *
 * @author priya-pt5111
 */
public class LinkedListDemo {
    public static void main(String[] arg)
    {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Java");
        l_list.add("Python");
        l_list.add("Scala");
        l_list.add("Swift");
        System.out.println("Linked List Content: " +l_list);
        l_list.add(2, "JavaScript");/*Add Items at specified position*/
        l_list.add(3, "Kotlin");
        System.out.println("List after editing: " +l_list);
        l_list.addFirst("First Course"); // add at frst
        l_list.addLast("Last Course"); // add at last
        System.out.println("List after addition: " +l_list);
        System.out.println("First Item: " +l_list.get(0)); // get by index
        l_list.set(0, "Java9"); // set by index
        System.out.println("List after updating first Item: " +l_list);
        l_list.remove(1);
        l_list.remove(2); // remove by index
        System.out.println("LinkedList after deletion : " +l_list);
        l_list.removeFirst(); // remove at frst
        l_list.removeLast(); // remove at last
        System.out.println("List after removing : "+l_list);

    }
}
