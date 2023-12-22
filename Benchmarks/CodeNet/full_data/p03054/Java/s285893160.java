import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int Sr = sc.nextInt();
		int Sc = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		System.out.println("AA");

		int flag=0;
		int up=Sr;
		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='U') {
				up++;
			}
			if (up>H) {
				flag=1;
				break;
			}
			if (T.charAt(i)=='D') {
				if (up>1) {
					up--;
				}
			}
		}

		int down=Sr;
		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='D') {
				down--;
			}
			if (down<1) {
				flag=1;
				break;
			}
			if (T.charAt(i)=='U') {
				if (down<H) {
					down++;
				}
			}
		}

		int left=Sc;
		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='L') {
				left--;
			}
			if (left<1) {
				flag=1;
				break;
			}
			if (T.charAt(i)=='R') {
				if (left<W) {
					left++;
				}
			}
		}

		int right=Sc;
		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='R') {
				right++;
			}
			if (right>W) {
				flag=1;
				break;
			}
			if (T.charAt(i)=='L') {
				if (right>1) {
					right--;
				}
			}
		}

		if (flag==0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}