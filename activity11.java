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
/*Activity 11:
Ravi and Kumar are working on an assignment. Ravi takes 6 hours to type 32 pages on a
computer, while Kumar takes 5 hours to type 40 pages. Design an algorithm to calculate how
much time they will take, working together on two different computers to type an assignment
of 110 pages.
*/
import java.io.*;
public class activity11 {
public static void main(String args[])
{
	int r_p=32,k_p=40,h1=6,h2=5;
	float ra=r_p/(float)h1;
        float ka=k_p/(float)h2;
        float c=(ra+ka);
        float time=110/c;
	int hr=(int)time;int mins = (int)((time-hr)*100);
        System.out.println("The time taken by both to complete 110 pages is : "+hr+" hours "+mins+" minutes");
}
}