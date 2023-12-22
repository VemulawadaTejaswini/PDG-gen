import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int[] S = new int[N+2];
		S[0] = 0;
		for(int i = 1;i <= N;i++) {
			S[i] = S[i-1] + sc.nextInt();
		}
		S[N+1] = Integer.MAX_VALUE;
		sc.close();
		Arrays.sort(S);
		int cnt = 1;
		int res = 0;
		for(int i = 0;i <=N;i++) {
			if(S[i] == S[i+1]) {
				cnt++;
			}else {
				res += cnt * (cnt - 1) / 2;
				cnt = 1;
			}
		}
		System.out.println(res);
	}
}