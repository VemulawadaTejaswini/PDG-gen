import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		long[] list = new long[n + 1];
		for(int i =0; i < n +1 ; i++) {
			list[i] = i + (long)Math.pow(10,100);
			System.out.println(list[i]);
		}
		long ans[] = new long[100000];
		for(int i = 0; i < Math.pow(2 , n);i++) {
			int flag = 0;
			for(int j =0; j < m; j++) {
				if((i>>>j & 1) == 1) {
					flag++;
					if(flag > m) {
						ans[i] = 1;
					}

				}
			}
		}
		int sum = 0;
		for(long i : ans) {
			sum +=(int)i;
		}
		System.out.println(sum);

	}
}
