import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int a = n;
		int ans = 0;
		
		while (n != x) {
			
			if (n >= 0 && x >= 0) {
				//n = +, x = +
				if (n < x) {
					n++;
				} else {
					n = n * -1;
				}
			} else if (n < 0 && x >= 0) {
				//n = -, x = +
				n++;
			} else if (n >= 0 && x < 0) {
				//n = +, x = -
				if (n == Math.abs(x)) {
					n = n * -1;
				} else {
					n++;
				}
			} else if (n < 0 && x < 0) {
				//n = -, x = -
				if (n < x) {
					n++;
				} else {
					n = n * -1;
				}
			}
			ans++;
		}

		System.out.println(ans);
	}
}