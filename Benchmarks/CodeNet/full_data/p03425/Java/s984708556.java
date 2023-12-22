import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num[] = new int[5];
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			switch (S.charAt(0)) {
				case 'M':
					num[0]++;
					break;
				case 'A':
					num[1]++;
					break;
				case 'R':
					num[2]++;
					break;
				case 'C':
					num[3]++;
					break;
				case 'H':
					num[4]++;
					break;
			}
		}
		long ans = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = i+1; j < 5; j++) {
				for (int k = j+1; k < 5; k++) {
					ans += num[i] * num[j] * num[k];
				}
			}
		}
		System.out.println(ans);
	}
}