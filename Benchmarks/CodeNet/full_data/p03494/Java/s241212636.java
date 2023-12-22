import java.util.Scanner;

public class Main {

	public static int two(int a) {
		int tmp = a;
		int cnt = 0;
		while(tmp % 2 == 0) {
			tmp /= 2;
			++cnt;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int min = 30;
		for(int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			int tmp = two(a[i]);
			min = Math.min(min,  tmp);
		}
		sc.close();
		System.out.println(min);
	}

}
