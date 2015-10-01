package Spoj;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	
	Scanner scan = new Scanner(System.in);
	int numTests = scan.nextInt();
	for(int i = 0; i < numTests;i++){
		int date = scan.nextInt();
		int month = scan.nextInt();
		int year = scan.nextInt();
		MyCalendar Cal = new MyCalendar(date, month, year);
		System.out.println(Cal.getDayofWeek());
		
	}
	
	
	scan.close();
	}

}
