import java.util.Scanner;

public class Elections {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int candAmnt = scan.nextInt();
		int cities = scan.nextInt();
		int[] wins = new int[candAmnt];

		for (int i = 0; i < cities; i++) {
			int[] votes = new int[candAmnt];
			for (int p = 0; p < candAmnt; p++) {
				votes[p] = scan.nextInt();
			}

			int max = 0;
			int indexMax = 0;
			for (int l = 0; l < candAmnt; l++) {
				if (votes[l] > max) {
					max = votes[l];
					indexMax = l;
				}
			}
			wins[indexMax]++;
			
		}
		int lastMax = 0;
		int lastIndex = 0;
		for (int z = 0; z < candAmnt; z++) {
			if (wins[z] > lastMax) {
				lastMax = wins[z];
				lastIndex = z;
			}

		}

		System.out.println(lastIndex + 1);

	}

}
