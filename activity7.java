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
/* Activity 7
A train running at the speed of x km/hr crosses a pole in y seconds. Design an algorithm to
accept x and y as inputs from the user and then calculate the length of the train.
Note: values of x and y must be positive and non-zero.
*/
import java.util.*;
import java.io.*;

public class activity7
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 double speed_in_km_per_hr=sc.nextDouble();
		 int time_in_sec=sc.nextInt();
		 if(speed_in_km_per_hr>0 && time_in_sec>0)
		 {
		     
		 
		 double speed_in_m_per_sec=speed_in_km_per_hr*(1000.0/3600.0);
		 System.out.println(speed_in_m_per_sec);
		 System.out.println("length of train is "+speed_in_m_per_sec*time_in_sec);
		 }
		 else System.out.println("speed and time shoud be positive and non-zero");

	}
}

