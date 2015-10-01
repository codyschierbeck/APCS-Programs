package ClassWork;

import java.util.Scanner;

public class Fibinci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int goTo = scan.nextInt();
		long first  = 0;
		long second = 1;
		long thing;
		for (int i = 1; i <= goTo; i++){
			thing = first + second;
			first = second;
			second = thing;
			if (goTo == i){
				System.out.println(thing);
			}
			
			
		}
		
		scan.close();
	}

}
