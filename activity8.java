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
A train X m long passes a man ,running at 5 km/hr in the same direction in which the train is going ,
in Y seconds.Design an algorithm to accept the values of X and Y as input from the user and then 
calculate the speed of the train.
Note: values of X and Y must be positive and non-zero.
*/
import java.util.*;
import java.io.*;

public class activity8
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 double len_in_km=sc.nextDouble();
		 int time_in_sec=sc.nextInt();
		 if(len_in_km>0 && time_in_sec>0)
		 {
		     double speed_train_kmperhr=(len_in_km/time_in_sec)+(5*(1000.0/3600.0));
		     System.out.println(speed_train_kmperhr*(18.0/5.0));
		 
		 
		 }
		 else System.out.println("length of train and time shoud be positive and non-zero");

	}
}

