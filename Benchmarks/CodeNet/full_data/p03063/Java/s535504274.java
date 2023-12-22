import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		char[] str = scn.nextLine().toCharArray();
		int[] black = new int[N+1];
		int ans = N;
		for(int i = 0;i < N ;i++) {
			black[i+1] = black[i]+(str[i]=='#'?1:0);
		}
		for(int i = 0;i <= N;i++) {
			ans = Math.min(ans,black[i] + ((N-i) - (black[N]-black[i])));
		}
		System.out.println(ans);
	}

}
