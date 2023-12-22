import java.util.Scanner;

public class Main {
	int[] arr = null;
	public long sad(int b) {
		long total = 0;
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
		for (int i=0; i<n; i++) {
			m.arr[i] = scan.nextInt();
		}
		long min = Integer.MAX_VALUE;
		for (int i=0; i<=100000000; i++) {
			long j=m.sad(i);
			if (j<min) {
				min=j;
			}
		}

		System.out.println(min);
		scan.close();
	}
}
