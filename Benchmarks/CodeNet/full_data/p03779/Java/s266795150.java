import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int cnt = 1;
		boolean flag = true;
		while(flag) {
			if(X - cnt <= 0) {
				flag = false;
				System.out.println(cnt);
			}
			X -= cnt;
			cnt++;
		}
	}
}
