import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 1 ; i <= 10000000 ; i++) {
			if(func(i) == d) cnt++;
			if(cnt == n) {
				System.out.println(i);
				return;
			}
		}
	}

	static int func(int x) {
		int ret = 0;
		while(x % 100 == 0) {
			ret++;
			x /= 100;
		}
		return ret;
	}

}
