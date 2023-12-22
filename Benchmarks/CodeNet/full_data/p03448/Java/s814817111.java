import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int c = sc.nextInt(), x = sc.nextInt();
		sc.close();
		int tmpa = a, tmpb = b, tmpc = c, tmpx = x / 50;
		int r = tmpx % 2;
		int ans = 0;
		for (int i = r; i <= x; i += 2) {
			if(i > tmpc)break;
			int tmp = (tmpx - i) / 2;
			int tr = tmp % 5;
			for(int j = tr; j <= tmp; j += 5) {
				if(j > tmpb)break;
				int tmp2 = (tmp - j) / 5;
				if(tmp2 <= a && tmp >= 0)++ans;
			}
		}
		System.out.println(ans);
	}

}
