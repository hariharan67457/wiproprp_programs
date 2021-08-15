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
/* Activity 15:
The difference between a two-digit number and the number obtained by interchanging the
positions of its digits is 36. Design an algorithm to find the difference between the two digits of
that number.
*/
import java.util.*;
public class activity3{
public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the level of pyramid : ");
		int n=sc.nextInt();
		int pos=1,space=n-1,num=1;
		while(pos<=n){
			for(int i=1;i<=space;i++)
				System.out.print(" ");
			for(int i=1;i<=pos;i++){
				if(num>9){
					num=num%9-1;
				}
				System.out.print(num);num++;
			}
			int rev=num-2;
			for(int i=1;i<pos;i++){
				if(rev<0){
					rev=9;
				}
				System.out.print(rev);rev--;
			}
			pos++;System.out.print("\n");space--;
		}
	}
}