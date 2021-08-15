
package milestone1;

/**
 *
 * @author Acer
 */
/*
1.Design an algorithm to accept 25 integer elements for an array then find the maximum number
in the set and display it.
*/
import java.util.*;
import java.io.*;
public class activity1 {
    public static void main(String args[]) {
      int a[]=new int[25];
      int i;
      Scanner sc=new Scanner(System.in);
      
      for(i=0;i<25;i++)
      a[i]=sc.nextInt();
      int max=a[0];
      for(i=1;i<25;i++)
      {
          if (a[i]>max)
          max=a[i];
      }
      System.out.println(max);
      
    }
}

