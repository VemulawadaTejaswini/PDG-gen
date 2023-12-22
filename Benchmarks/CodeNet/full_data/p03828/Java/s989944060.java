import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long sum = 1;
		long c = 1000000007;
		long[] soinsu = new long[1000];
		
		for(int i = 1; i <= N; i++) {
			loop:
			for(int j = 2; j <= N; j++) {
				if(j % 2 == 0 && j > 2) {
					continue;
				}
				for(int k = 2; k <= j - 1; k++) {
					if(j % k == 0) {
						continue loop;
					}
				}
				int a = i;
				while(a % j == 0 && j > 1) {
					soinsu[j]++;
					a /= j;
				}
			}
		}
		for(int i = 0; i < soinsu.length; i++) {
			if(soinsu[i] > 0) {
				sum = sum % c * (soinsu[i] + 1) % c;
			}
		}
		System.out.println(sum);
	}
}
