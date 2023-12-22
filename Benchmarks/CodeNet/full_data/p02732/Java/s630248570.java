import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(in.next());
		}
		for (int k = 0; k < n; k++) {
			int count = 0;
			for (int i = 0; i < n - 1; i++) {
				if (i == k) {
					continue;
				} 
				
				for (int j = i + 1; j < n; j++) {
					if (j == k) {
						continue;
					} 
					if(a[i] == a[j]) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}	