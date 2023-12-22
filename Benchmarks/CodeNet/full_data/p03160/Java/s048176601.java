import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] h = new int[n];
		
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		
		int[] a = new int[n];
		a[0] = 0;
		a[1] = Math.abs(h[1] - h[0]);
		
		for (int i = 2; i < n; i++) {
			a[i] = Math.min(a[i-1] + Math.abs(h[i] - h[i-1]), a[i-2] + Math.abs(h[i] - h[i-2]));
		}
		
		System.out.println(a[n-1]);
	}
}