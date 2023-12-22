

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n*3];
		for(int i=0; i<n*3; i++){
			a[i] = in.nextInt();
		}
		Arrays.sort(a);

		long sum = 0;
		for(int i=0; i<n; i++){
			sum += a[n*3-(i+1)*2];
		}

		System.out.println(sum);
	}

}
