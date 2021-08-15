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
/*
Activity 5:
Design an algorithm which accepts 10 integer values, calculates the average and prints it.
*/

import java.util.*;
import java.io.*;

public class activity5
{
	public static void main(String[] args) {
		 int a[]=new int[10];
      int i;
      Scanner sc=new Scanner(System.in);
      
      for(i=0;i<10;i++)
      a[i]=sc.nextInt();
      int sum=0;
      for(i=0;i<10;i++)
      {
          sum+=a[i];
      }
      
      System.out.println(sum/10);

	}
}
