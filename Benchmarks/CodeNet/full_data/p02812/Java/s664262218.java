import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N		= sc.nextInt();
		String S	= sc.next();
		int ans		= 0;
		for(int i = 0; i < N; i++) {
			if(S.charAt(i++)=='A') {
				if(i<N&&S.charAt(i++)=='B') {
					if(i<N&&S.charAt(i)=='C') {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
