package Math.java;

public class Math {
private static double num = 0;
private static int moDiv;
private static long longNum = 0;

public static double add(double a, double b)
{
	num = a + b;
	return num;
}
public static double subtract(double a, double b)
{
	num = a -b;
	return num;
}
public static double mult(double a, double b)
{
	num = a -b;
	return num;
}
public static double div(double a, double b) throws Exception
{
	if (b == 0)
	{
		throw new Exception("You're an idiot because you divided by zero, AHAHAHA");
	}
	num = a / b;
	return num;
}
public static double sqr(double a)
{
	num = a * a;
	return num;
}
public static long exponent(long a, long b)
{
	longNum = 1;
	for (int i = 0; i < b; i++){
		longNum *= a;
	}
	return longNum;
}
public static double sqrt(int number) {
	double t;
 
	double squareRoot = number / 2;
 
	do {
		t = squareRoot;
		squareRoot = (t + (number / t)) / 2;
	} while ((t - squareRoot) != 0);
 
	return squareRoot;
}
public static int mod(int a, int b)
{
	moDiv = a / b;
	int modHelp = b * moDiv;
	return a - modHelp;
}
}
