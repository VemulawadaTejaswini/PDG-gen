import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		int[] W = new int[N];
		int[] E = new int[N];
		for(int i = 0;i < N;i++) {
			if(S.charAt(i)=='W') {
				W[i]++;
			}else if(S.charAt(i)=='E') {
				E[i]++;
			}
		}
		int[] Wsum = new int[N+1];
		int[] Esum = new int[N+1];
		for(int i = 0;i < N;i++) {
			Wsum[i+1] = Wsum[i]+W[i];
			Esum[i+1] = Esum[i]+E[i];
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 0;i < N;i++) {
			int calc = 0;
			calc += Esum[N]-Esum[i];
			calc += Wsum[i];
			ans = Math.min(ans, calc);
		}
		System.out.println(ans);
	}
}