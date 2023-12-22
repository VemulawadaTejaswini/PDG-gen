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

//add
		int care1=0;
		int care1_temp=0;
		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='D') {
				care1_temp++;
			}
			care1=Math.max(care1,care1_temp);
			if (i==N-1) {
				break;
			}
			if (T.charAt(i)=='U') {
				care1_temp--;
			}
		}
//add

//add
		int care2=0;
		int care2_temp=0;
		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='U') {
				care2_temp++;
			}
			care2=Math.max(care2,care2_temp);
			if (i==N-1) {
				break;
			}
			if (T.charAt(i)=='D') {
				care2_temp--;
			}
		}
//add

//add
		int care3=0;
		int care3_temp=0;
		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='R') {
				care3_temp++;
			}
			care3=Math.max(care3,care3_temp);
			if (i==N-1) {
				break;
			}
			if (T.charAt(i)=='L') {
				care3_temp--;
			}
		}
//add

//add
		int care4=0;
		int care4_temp=0;
		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='L') {
				care4_temp++;
			}
			care4=Math.max(care4,care4_temp);
			if (i==N-1) {
				break;
			}
			if (T.charAt(i)=='R') {
				care4_temp--;
			}
		}
//add

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
				if (care1>=up-1) {//add
				} else {//add
					if (up>1) {
						up--;
					}
				}
			}
			if (T.charAt(i)=='R') {//change
				care1++;//chanege
				if (care1>=up) {//change
					up++;//change
				}//change
			}//change
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
				if (care2>=down-1) {//add
				} else {//add
					if (down<H) {
						down++;
					}
				}
			}
			if (T.charAt(i)=='D') {//change
				care2--;//chanege
				if (care2<=down) {//change
					down--;//change
				}//change
			}//change
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
				if (care3>=left-1) {//add
				} else {//add
					if (left<W) {
						left++;
					}
				}
			}
			if (T.charAt(i)=='L') {//change
				care3--;//chanege
				if (care3<=left) {//change
					left--;//change
				}//change
			}//change
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
				if (care4>=right-1) {//add
				} else {//add
					if (right>1) {
						right--;
					}
				}//add
			}
			if (T.charAt(i)=='R') {//change
				care4++;//chanege
				if (care4>=right) {//change
					right++;//change
				}//change
			}//change
		}

		if (flag==0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}