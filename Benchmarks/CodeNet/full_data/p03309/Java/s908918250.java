import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int[] arr = null;




	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Main m = new Main();
		m.arr = new int[n];
		int arr[] = new int[n];
		for (int i=0; i<m.arr.length; i++) {
			arr[i] = scan.nextInt();
			m.arr[i] = arr[i];
			m.arr[i] -= (i+1);

		}
		Arrays.sort(m.arr);
		int b = m.arr[(n+1)/2];
		int ans = 0;
		for (int i=0; i<arr.length; i++) {
			ans += Math.abs(arr[i]-(b+i+1));
		}
		System.out.println(ans);
		scan.close();
	}
}