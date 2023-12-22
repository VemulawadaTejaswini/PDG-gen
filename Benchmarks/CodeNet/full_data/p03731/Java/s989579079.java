import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i  <n ; i++) a[i] = sc.nextInt();
		int now = 0;
		for(int i = 0 ; i < n ; i++) {
			if(a[i] <= now && now <= a[i] + t) now = a[i] + t;
			else now += t;
		}
		System.out.println(now);
	}
}