import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		// 素数を求める（ローカルで計算しといてプログラム中に静的に配列を持っておけば計算時間短縮）
		boolean[] is_prime = new boolean[30001];
		
		Arrays.fill(is_prime, true);
		
		// 0 は素数じゃない
		is_prime[0] = false;
		
		// 1は素数
		System.out.printf("%d ", 1);
		int num = 1;

		for(int i = 2; i<=30000; i++) {
			if(is_prime[i]) {
				System.out.printf("%d ", i);
				num++;
				
				if(num >= N) {
					break;
				}
				for(int j = i * 2; j<=30000; j += i) {
					is_prime[j] = false;
				}
			}
		}
		
		System.out.println();
		
	}

}
