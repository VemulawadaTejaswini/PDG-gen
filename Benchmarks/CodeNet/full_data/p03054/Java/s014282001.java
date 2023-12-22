import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		int n = scanner.nextInt();
		int sr = scanner.nextInt();
		int sc = scanner.nextInt();
		String s = scanner.next();
		String t = scanner.next();
		boolean end = false;
		//左から
		int hidari = sc;
		if (s.charAt(0) == 'L') {
			hidari--;
		}
		for (int i = 0; i < n - 1; i++) {
			if (hidari == 0) {
				end = true;
				break;
			} else {
				if (t.charAt(i) == 'R') {
					hidari = Math.min(hidari + 1, w);
				}
				if (s.charAt(i + 1) == 'L') {
					hidari--;
				}
			}
		}
		if (hidari == 0) {
			end = true;
		}
		//右から
		int migi = sc;
		if (s.charAt(0) == 'R') {
			migi++;
		}
		for (int i = 0; i < n - 1; i++) {
			if (migi == w + 1) {
				end = true;
				break;
			} else {
				if (t.charAt(i) == 'L') {
					migi = Math.max(1, migi - 1);
				}
				if (s.charAt(i + 1) == 'R') {
					migi++;
				}
			}
		}
		if (migi == w + 1) {
			end = true;
		}
		//上
		int ue = sr;
		if (s.charAt(0) == 'U') {
			ue--;
		}
		for (int i = 0; i < n - 1; i++) {
			if (ue == 0) {
				end = true;
				break;
			} else {
				if (t.charAt(i) == 'D') {
					ue = Math.min(ue + 1, h);
				}
				if (s.charAt(i + 1) == 'U') {
					ue--;
				}
			}
		}
		if (ue == 0) {
			end = true;
		}
		//下から
		int sita = sr;
		if (s.charAt(0) == 'D') {
			sita++;
		}
		for (int i = 0; i < n - 1; i++) {
			if (sita == h + 1) {
				end = true;
				break;
			} else {
				if (t.charAt(i) == 'U') {
					sita = Math.max(1, sita - 1);
				}
				if (s.charAt(i + 1) == 'D') {
					sita++;
				}
			}
		}
		if (sita == h + 1) {
			end = true;
		}
		if (!end) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}