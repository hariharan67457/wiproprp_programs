/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestone1;

/* 2.Design an algorithm to accept 10 integer elements for an array and then find the number of
times the number with the maximum value occurs in the array.
*/
import java.util.*;
import java.io.*;

public class activity2
{
	public static void main(String[] args) {
	 int a[]=new int[10];
      int i;
      Scanner sc=new Scanner(System.in);
      
      for(i=0;i<10;i++)
      a[i]=sc.nextInt();
      int max=a[0];
      for(i=1;i<10;i++)
      {
          if (a[i]>max)
          max=a[i];
      }
      int cnt=0;
      for(i=0;i<10;i++)
      {
          if (max==a[i])cnt+=1;
      }
      System.out.println(cnt);

	}
}
