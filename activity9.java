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
/*Activity 9:
In an election between two candidates, one got 55% of the total valid votes, 20% of the votes
were invalid. The total number of votes was X (value greater than 5000), design an algorithm to
accept a value for X from the user and calculate the number of valid votes that the other
candidate got.
*/
import java.util.*;

public class activity9 {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the total no of votes : ");
	    int n=sc.nextInt();
	    
	    int other_votes = (n*80*45)/(100*100);
	    System.out.print("The number of valid votes for other candidate is : "+other_votes);
	}
}