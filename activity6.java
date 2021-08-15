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
Design an algorithm to accept a given string from the user. The algorithm must then remove
characters from the string which appear more than once.
For Example –
If input string is – malayalam
The output must be – maly
*/

import java.util.*;
import java.io.*;

public class activity6
{
	public static void main(String[] args) {
		 String s;
		 Scanner sc=new Scanner(System.in);
		 s=sc.next();
		 String su="";
		 for(int i=0;i<s.length();i++)
		 {
		     int f=0;
		     for(int j=0;j<su.length();j++)
		     {
		        if ( s.charAt(i)==su.charAt(j))
		        {f=1;
		        break;
		        }
		         
		     }
		     if (f==0)
		     su=su+s.charAt(i);
		 }
		 System.out.println(su);
	}
}

