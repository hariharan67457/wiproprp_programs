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
Activity 15:
The difference between a two-digit number and the number obtained by interchanging the
positions of its digits is 36. Design an algorithm to find the difference between the two digits of
that number.*/
import java.util.*;
public class activity15 {
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int n, r; 
	    /* let n be the number ,r be the interchanged number .a,b be the digits .
            Then n=10*a+b ,r=10*b+a their difference num_diff=(10*a +b)-(10*b+a)=9*(a-b) which inturn gives
            a-b=num_diff/9
            */
	    int num_diff=36;
	    
	    int digit_diff = (num_diff) / 9;
	    System.out.print("The difference between digits of the number is : "+digit_diff);
	}
    
}
