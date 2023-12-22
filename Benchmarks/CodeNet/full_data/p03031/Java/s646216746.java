import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] s = new int[m];
		int[] p = new int[m];
		int num = 0;
		for(int i = 0 ; i < m  ; i++) {
			int allS = 0;
			int k = sc.nextInt();
			for(int j = 0 ; j < k ; j++) {
				allS = allS | sc.nextInt(); // & And  | Or ^  Xor ~  Not(ビット反転)
			}
			s[i] = allS;
		}
		for(int i = 0 ; i < m  ; i++) {
			p[i] = sc.nextInt();
		}
		for (int i = 0; i < (1 << n) + 1 ; i++) {
			boolean flag = true;
			for(int j = 0 ; j < m ; j++) {
				int k = s[j] & i;
				if(Integer.bitCount(k) % 2 != p[j]) {
					flag = false;
					continue;
					}
			}
			if(flag)
				num++;
		}
		sc.close();
			System.out.println(num);
	}
}
