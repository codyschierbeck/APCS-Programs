package ClassWork;

import java.util.Scanner;

public class nSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ans = 0;
		if (n < 0){
			for (int i = -1; i >= n; i--){
				ans += i;
			}
		}
		else{
		for (int i = 1; i <= n; i++)
		{
			ans += i;		
		}
		}
		System.out.println(ans);
		scan.close();
	}
	
}
