
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
       
       int[] arr = new int[500];
       int i;
       for( i=0;i<500;i++)
       {
           arr[i]=i;
       }
       i=0;
	long startTime1 = System.nanoTime();
       try
       {
           while(true)
           {
               arr[i]=i;
               i++;
           }
       }
       catch(Exception e)
       {
           
       }
long endTime1 = System.nanoTime();
long startTime2 = System.nanoTime();
for(i=0;i<arr.length;i++)
{

arr[i]=i;
}
 long endTime2 = System.nanoTime();      
       long timeElapsed1 = endTime1 - startTime1;
 long timeElapsed2 = endTime2 - startTime2;
        System.out.println("Execution time1 in nanoseconds: " + timeElapsed1);
        System.out.println("Execution time1 in milliseconds: " + timeElapsed1 / 1000000);
System.out.println("Execution time1 in nanoseconds: " + timeElapsed2);
        System.out.println("Execution time1 in milliseconds: " + timeElapsed2 / 1000000);
    }

    
}
