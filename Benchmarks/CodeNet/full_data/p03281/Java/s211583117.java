import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int ans = 0;
		for(int i = 1;i <= N;i++) {
			if(i%2!=0) {
				int num = 0;
				for(int j = 1;j <=i;j++) {
					if(i%j==0)num++;
				}
				if(num==8)ans++;
			}
		}
		System.out.println(ans);
		scn.close();
	}
}
