
public class GarbageCollectionDemo {
    GarbageCollectionDemo gcd;
    public static void main(String[] arg)
    { 
        GarbageCollectionDemo gcd1 = new GarbageCollectionDemo();
        GarbageCollectionDemo gcd2 = new GarbageCollectionDemo();
        GarbageCollectionDemo gcd3 = new GarbageCollectionDemo();
        GarbageCollectionDemo gcd4 = new GarbageCollectionDemo();
        gcd1 = null; //1.Nullify the object will make it elligble for garbage collection
        gcd3 =gcd2;  //2.Reassigning Reference variable will make gcd3 ready for garbage collection
        System.out.println(gcd1);
        System.out.println(gcd2);
        System.out.println(gcd3);
        System.out.println(gcd4);
        gcd4.display();
        //4. Island of Isolation when all the object is nullified.  
        System.gc(); // Runtime.getRuntime().gc();
        Runtime rt = Runtime.getRuntime();
        rt.gc();  // 2 methods to call gc explicitly.
    }
    public void display()
    {
        GarbageCollectionDemo gcd5 = new GarbageCollectionDemo();
        System.out.println(gcd5);
    } // 3. (object inside method) When the method is terminated then gcd5 is ready for garbage collection
    public void finalize() // this method is called when gc is activated.
    {
        System.out.println("This method is called");
    } 
}
