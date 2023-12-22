import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Integer[] a = new Integer[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		Arrays.sort(a, Collections.reverseOrder());
		if(a[m-1] < (double)(sum/(4*m)))System.out.println("No");
		else System.out.println("Yes");
	}

}
