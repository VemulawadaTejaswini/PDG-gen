import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//a==1 or b==n の時だけ考える
		boolean[] vis1 = new boolean[200010];
		boolean[] vis2 = new boolean[200010];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==1) {
				vis1[b]=true;
			} else if(b==n) {
				vis2[a]=true;
			}
		}
		for(int i = 0; i < 2000010; i++) {
			if(vis1[i]==true&&vis2[i]==true) {
				System.out.println("POSSIBLE");
				return;
			}
		}
		System.out.println("IMPPOSSIBLE");
	}
}