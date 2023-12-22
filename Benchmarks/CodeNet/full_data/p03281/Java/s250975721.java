import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N;
	    Scanner in = new Scanner(System.in);
	    N = Integer.parseInt(in.next());
	    int cnt;
	    int ans = 0;
	    for (int i = 1; i <= N; i+=2) {
	    	cnt = 0;
			for (int j = 1; j*j <= i; j++) {
				if(i%j==0) {
					if(j*j == i) {
						cnt++;
					}else {
						cnt+=2;
					}
				}
			}
			if(cnt == 8) {
				ans++;
			}
		}
	    System.out.println(ans);
	}
}