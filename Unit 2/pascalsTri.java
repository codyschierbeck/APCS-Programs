import java.util.Scanner;


public class pascalsTri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int pasNum = scan.nextInt() + 1;
		int tri[][] = new int[pasNum][pasNum];
		
		for (int i = 0; i < pasNum; i++){
			for(int j = 0; j <= i; j++){
				if(j==0 || j == i){
					tri[i][j] = 1;
				}
				else{
					tri[i][j] = tri[i-1][j] + tri[i-1][j-1];
				}
			
			}
		}
		for(int i = 0; i < pasNum; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(tri[i][j] + " ");
				
			}
			System.out.println();
			
		}

	}

}
