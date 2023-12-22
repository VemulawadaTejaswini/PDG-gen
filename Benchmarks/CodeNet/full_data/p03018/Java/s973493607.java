import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long cnt=0L;
		int cnt_1=0;
		int cnt_2=0;
		int right=-98;
		int left=0;
		for (int i=0;i<S.length()-2;i++) {
			if (S.charAt(i)=='A' && S.charAt(i+1)=='B' && S.charAt(i+2)=='C') {
				cnt++;
				cnt_1++;
				int j=i-1;
				left=j+1;
				if (left==right) {
					cnt++;
					cnt_2++;
				}
				while (j>=0 && S.charAt(j)=='A'/*S.charAt(j)=='C' && S.charAt(j-1)=='B'*/) {
					cnt++;
					cnt_1++;
					left=j;
					if (left==right) {
						cnt++;
						cnt_2++;
					}
					j--;
//				System.out.println("left: " + left);
//				System.out.println("right " + right);
				}
				int k=i+3;
				right=k;
				while (k<S.length()-1 && S.charAt(k)=='B' && S.charAt(k+1)=='C'/*S.charAt(k)=='A'*/) {
					cnt++;
					cnt_1++;
					k+=2;
					right=k;
				}
			}
		}
		System.out.println(cnt);
//		System.out.println(cnt_1);
//		System.out.println(cnt_2);
	}
}
