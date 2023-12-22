import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] ary = new long[n];
		int[] bits = new int[61];
		for(int i=0; i<n; i++){
			ary[i] = sc.nextLong();
			for (int j = 0; j < 60; j++) {
				if ((1 & ary[i] >> j) == 1) {
					bits[j+1]++;
				}
			}
		}

		long result = 0;
		for(int i=0; i<ary.length; i++){
			for (int j = 0; j < 60; j++) {
				if ((1 & ary[i] >> j) == 1) {
					result += (n-bits[j+1])*(Math.pow(2, j));
					bits[j+1]--;
				} else {
					result += bits[j+1]*Math.pow(2, j);
				}
			}
			n--;
		}
		System.out.println(result%1_000_000_007);
	}
}
