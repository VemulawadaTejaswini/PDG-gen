
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if(n == 0) {
			System.out.println(0);
		} else if(n > 0) {
			String ans = "";
			int tmp = 0;
			while(n != 0) {
				if((n & 1) == 1) {
					ans = "1" + ans;
					if(tmp % 2 != 0) {
						n = n + 2;
					}
				} else {
					ans = "0" + ans;
				}
				n = n >> 1;
				tmp++;
			}
			System.out.println(ans);
		} else {
			n = -n;
			String ans = "";
			int tmp = 0;
			while(n != 0) {
				if((n & 1) == 1) {
					ans = "1" + ans;
					if(tmp % 2 == 0) {
						n = n + 2;
					}
				} else {
					ans = "0" + ans;
				}
				n = n >> 1;
				tmp++;
			}
			System.out.println(ans);
		}

	}

}
