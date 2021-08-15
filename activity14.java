/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestone1;

/**
 *
 * @author Acer
 */
/*Activity 14:
Design an algorithm to find the greatest number that will divide 43, 91 and 183 so as to leave
the same remainder in each case.*/
import java.util.*;
public class activity14 {
    public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      int x=43,y=91,z=183;
    
      int p=Math.abs(x-y);
      int q=Math.abs(z-y);
      int w=Math.abs(z-x);
      int gcdNumbers = activity14.findGCD(p, q, w);
      System.out.println(gcdNumbers);
      sc.close();
   }
   public static int findGCD(int x, int y) 
   {
      if(y == 0)
      {
         return x;
      }
      else
      {
         return findGCD(y, x % y);
      }
   }
   public static int findGCD(int x, int y, int z) 
   {
      return findGCD(findGCD(x, y), z);
   }
    
}
