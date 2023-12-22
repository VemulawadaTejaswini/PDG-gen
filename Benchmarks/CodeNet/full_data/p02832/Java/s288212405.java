import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N =scn.nextInt();
		int ans = 0;
		int now = 1;
		for(int i = 0;i < N;i++) {
			int a = scn.nextInt();
			if(a == now) {
				now++;
			}else {
				ans++;
			}
		}
		System.out.println((ans==N)?-1:ans);
	}

}
