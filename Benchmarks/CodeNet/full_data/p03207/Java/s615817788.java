import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array=new int[n];
		int sum=0;

		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for(int i=0;i<n-1;i++) {
			sum+=array[i];
		}

		System.out.println(sum+array[n-1]/2);
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


