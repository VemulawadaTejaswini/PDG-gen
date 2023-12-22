import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int cnt_0=0;
		int cnt_1=0;
		for (int i=0;i<N;i++) {
			if(S.charAt(i)=='0') {
				cnt_0++;
			}else{
				cnt_1++;
			}
		}
		System.out.println(Math.min(cnt_0,cnt_1)*2);
	}
}