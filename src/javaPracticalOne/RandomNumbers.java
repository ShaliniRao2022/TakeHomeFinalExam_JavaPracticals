package javaPracticalOne;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int number;
		int [] num = new int [500];
		
		
		for (int i=0; i<500; i++) {
			
			number = rnd.nextInt(500);
			num[i] = number;
					}
		
		Arrays.sort(num);
		
		for (int j=0; j<500; j++) {
					
			System.out.print(num[j]+" ");
		}
		
			System.out.println();	
		Scanner ui = new Scanner (System.in);
		System.out.println("Please enter the nth smallest number");
		int n = ui.nextInt();
		System.out.println(num[n-1]);
	}

}