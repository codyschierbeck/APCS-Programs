package Game24;

import java.util.Scanner;


public class MainGame {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int ans = scan.nextInt();
		int times = 0;
		if (ans <=3){
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
		
		if (ans % 2 == 0)
		{
			for(int i = ans; i > 4; i-=2)
			{
				System.out.println(i + " - " + (i-1) + " = " + 1);
				times++;				
			}
			System.out.println(1 + " * " + 2 + " = " + 2);
			System.out.println(2 + " * " + 3 + " = " + 6);
			System.out.println(6 + " * " + 4 + " = " + 24);
			for(int i = 0; i < times; i++){
				System.out.println(24 + " * " + 1 + " = " + 24);
			}
		}
		if (ans % 2 == 1){
			for (int i = ans; i > 5; i-=2){
				System.out.println(i + " - " + (i - 1) + " = " + 1);
				times++;
			}
			System.out.println(5 + " * " + 4 + " = " + 20);
			System.out.println(20 + " + " + 3 + " = " + 23);
			System.out.println(23 + " + " + 2 + " = " + 25);
			System.out.println(25 + " - " + 1 + " = " + 24);
			for(int i = 0; i < times; i++){
				System.out.println(24 + " * " + 1 + " = " + 24);
			}
		}
	}
	}
}
