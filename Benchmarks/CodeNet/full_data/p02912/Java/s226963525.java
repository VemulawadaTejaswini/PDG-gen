import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int []a = new int[n];
		//int []b = new int[n];
		//int []c = new int[n];
		for(int i = 0;i < n;i++) {
			a[i] = sc.nextInt();
			//b[i] = a[i];
			//c[i] = 0;
		}
		int lon = a.length;
		Arrays.sort(a);
		for(int i = 0;i < m;i++) {
			a[lon - 1] = a[lon - 1] / 2;
			int j = lon - 1;
			while(j >= 0 && a[j] > a[lon - 1]) {
				j--;
			}
			int swap = a[j];
			if(j == lon) {
				for(int k = j + 1;j < lon;j++) {
					a[k] = a[k - 1];
				}
				a[j] = a[lon - 1];
			}
		}

		long sum = 0;
		for(int i = 0;i < n;i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}