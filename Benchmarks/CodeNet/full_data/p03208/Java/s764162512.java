import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int sum=999999999;
		for (int i = 0; i <= n -k; i++) {
			if(sum>a[i+k-1]-a[i]){
				sum=a[i+k-1]-a[i];
			}
		}
		System.out.println(sum);
	}
}