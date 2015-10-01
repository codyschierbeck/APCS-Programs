package Math.java;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MathTest 
{
	private static double doub1, doub2;
	private static long long1, long2;
	
	public static void main(String[] args) throws Exception
	{
		JOptionPane.showMessageDialog(null,"1 = add, 2 = subtract, 3 = multiply, 4 =divide, 5 = square. 6 = exponent, 7 = sqrt, 8 = mod", "Hello and Welcome", JOptionPane.INFORMATION_MESSAGE);
		Scanner scan = new Scanner(System.in);
		int ans = scan.nextInt();
		if (ans == 1)
		{
			doub1 = scan.nextDouble();
			doub2 = scan.nextDouble();
			System.out.println(Math.add(doub1, doub2));
			
		}
		if (ans == 2)
		{
			doub1 = scan.nextDouble();
			doub2 = scan.nextDouble();
			System.out.println(Math.subtract(doub1, doub2));
		}
		if (ans == 3){
			doub1 = scan.nextDouble();
			doub2 = scan.nextDouble();
			System.out.println(Math.mult(doub1, doub2));
		}
		if (ans == 4){
			doub1 = scan.nextDouble();
			doub2 = scan.nextDouble();
			System.out.println(Math.div(doub1, doub2));
		}
		if (ans == 5){
			doub1 = scan.nextDouble();
			System.out.println(Math.sqr(doub1));
		}
		if (ans == 6){
			long1 = scan.nextLong();
			long2 = scan.nextLong();
			System.out.println(Math.exponent(long1, long2));
		}
		if (ans == 7){
			int num = scan.nextInt();
			System.out.println(Math.sqrt(num));		
		}
		if (ans == 8){
			int num2 = scan.nextInt();
			int num = scan.nextInt();
			System.out.println(Math.mod(num2, num));
		}
		
	}
	

}
