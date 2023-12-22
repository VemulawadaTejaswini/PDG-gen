
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		for(int i = 0 ; i < n ; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		int start;
		int end;
		if(d.length % 2 == 0) {
			start = d[d.length / 2 - 1];
			end = d[d.length / 2];
		} else {
			start = d[d.length / 2];
			end = d[d.length / 2 + 1];
		}
		System.out.println(end - start);
		sc.close();

	}

}
