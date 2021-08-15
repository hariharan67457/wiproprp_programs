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
Activity 13:
The difference between the length and breadth of a rectangle is 23 m. If its perimeter is 206 m,
design an algorithm to calculate its area.*/
import java.util.*;
public class activity13 {
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int diff_lb = 23;
	    int perimeter = 206;
	    int sum_lb = perimeter/2;
	    int l=(diff_lb+sum_lb)/2;
	    int b=sum_lb-l;
	    int area=l*b;
	    System.out.print("The area of rectangle is : "+area);
	}
    
}
