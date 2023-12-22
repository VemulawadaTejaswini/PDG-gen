import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0;i < N;++i)
			a[i] = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i = 0;i < N;++i)
			sum += a[i];
		double ave = ((double)sum) / N;
		
		int ans = 0;
		double minDiff = Math.abs(a[0] - ave);
		for(int i = 1;i < N;++i) {
			if(Math.abs(a[i] - ave) < minDiff) {
				ans = i;
				minDiff = Math.abs(a[i] - ave);
			}
		}
		
		System.out.println(ans);
	}
}
