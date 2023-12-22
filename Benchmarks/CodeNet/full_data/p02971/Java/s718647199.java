import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int max = 0;
		int[] tmpArray = array.clone();
		for(int i = 0; i < n; i++){
			array[i] = 0;
			Arrays.sort(array);
			System.out.println(array[n-1]);
			array = tmpArray.clone();
		}
	}

}