
import java.util.Scanner;

public class Main {

	public static String[] str;
	public static int H, W;
	public static int wide = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		str = new String[H + 1];
		for(int i = 1; i < H + 1; i++) {
			str[i] = sc.next();
		}
		int ans = 0;
		for(int i = 1; i < W + 1; i++) {
			wide = 0;
			for(int j = 1; j < H + 1; j++) {
				if(str[j].charAt(i - 1) == '.') {
					ans = Math.max(ans, Calc(i, j));
				} else {
					wide = 0;
				}
			}
		}
		System.out.println(ans);
	}

	public static int Calc(int i, int j) {
		int count = 1;
		if(wide == 0) {
			for(int k = i + 1; k < W + 1; k++) {
				if(str[j].charAt(k - 1) == '.') {
					wide++;
				} else {
					break;
				}
			}
		}
		count += wide;
		for(int k = j + 1; k < H + 1; k++) {
			if(str[k].charAt(i - 1) == '.') {
				count++;
			} else {
				break;
			}
		}
		for(int k = j - 1; k > 0; k--) {
			if(str[k].charAt(i - 1) == '.') {
				count++;
			} else {
				break;
			}
		}
		return count;
	}

}
