
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ans = "";
		if(a == 0 && b == 0) {
			ans = "No";
		} else if(a == 0 && w == 1) {
			for(int i = 0; i < b; i++) {
				ans += "1\n";
			}
			for(int i = b; i < h; i++) {
				ans += "0\n";
			}
		} else if(b == 0 && h == 1) {
			for(int i = 0; i < a; i++) {
				ans += "1";
			}
			for(int i = a; i < w; i++) {
				ans += "0";
			}
			ans += "\n";
		} else if(a * h != b * w)
			ans = "No";
		else {
			int k = 1;
			for(int i = 0; i < h; i++) {
				if(i == b * k)
					k++;
				for(int j = 0; j < b * (k - 1); j++) {
					ans = ans + "0";
				}
				for(int j = b * (k - 1); j < b * k; j++) {
					ans = ans + "1";
				}
				for(int j = b * k; j < w; j++) {
					ans = ans + "0";
				}
				ans = ans + "\n";
			}
		}
		System.out.println(ans);
	}

}
