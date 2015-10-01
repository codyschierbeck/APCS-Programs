import java.util.Scanner;


public class SieveOfEro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		
		boolean[] check = new boolean[max + 1];
		
		for(int i = 2; i <= max; i++){
			if(!check[i]){
				for(int j = i * i; j <= max; j = j + i){
					check[j] = true;
				}
				
			}
		}
		for (int i = 2; i < max + 1; i++){
			if(!check[i]){
				System.out.println(i + " ");
			}
		}

	}

}
