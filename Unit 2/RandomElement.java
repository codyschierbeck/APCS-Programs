
public class RandomElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int randomNum = (int)(arr.length * Math.random());
		if(randomNum > 7){
			randomNum = randomNum % 7;
		}
		System.out.println(arr[randomNum]);
	}

}
