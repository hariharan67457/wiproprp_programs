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
/*Activity 4:
Design an algorithm to calculate the factorial of a number N. The value of N is provided as an
input by the user.*/
import java.util.*;
import java.io.*;
public class activity4
{
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		int fact=1;
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
		fact*=i;
		System.out.println(fact);
	}
}
