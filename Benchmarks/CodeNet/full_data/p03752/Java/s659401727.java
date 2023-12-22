import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int sum = scan.nextInt();
		int f = sum;
		int[] a = new int[n - 1];
		for(int i = 0; i < n - 1; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);

		int sub = sum;
		for(int i = 1; i < k; i++) {
			sum += sub + i;
		}

		int temp = 0;
		for(int i = 1; i < k; i++) {
			temp += a[a.length - i];
		}
		temp += f;
		System.out.println(sum - temp);
	}
}
