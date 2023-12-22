import java.util.Scanner;


public class Main {
	int[] arr = null;
	public int sad(int b) {
		int total = 0;
		for (int i=0; i<arr.length; i++) {
			total += Math.abs(arr[i]-(b+i+1));
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Main m = new Main();
		m.arr = new int[n];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i=0; i<n; i++) {
			m.arr[i] = scan.nextInt();
			if (m.arr[i]<min) {
				min = m.arr[i];
			}
			if (m.arr[i]>max) {
				max = m.arr[i];
			}
		}
		int ans = Integer.MAX_VALUE;
		for (int i=min-n; i<=max+n; i++) {
			int j=m.sad(i);
			if (j<ans) {
				ans=j;
			}
		}

		System.out.println(ans);
		scan.close();
	}
}