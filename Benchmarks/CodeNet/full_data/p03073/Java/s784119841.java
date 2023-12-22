import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int sl = S.length();
		int[] t = new int[sl];

		for(int i = 0;i<sl;i++) {
			t[i] = Integer.parseInt(S.substring(i,i+1));
		}
		int c = 0;
		for(int i = 0;i<sl;i++) {
			if(i%2==1||i==1) { //奇数なら
				if(t[i]==1) {
					c++;
				}
			}else {
				if(t[i]==0) {
					c++;
				}
			}
		}
		int ans;
		if(c > sl/2) {
			ans = sl-c;
		}else {
			ans = c;
		}
		System.out.println(ans);
	}
}