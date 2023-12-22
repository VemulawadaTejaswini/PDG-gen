import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		String A = in.next();
		int[] alph = new int[26];
		for(int i=0;i<A.length();i++){
			alph[A.charAt(i)-'a'] ++;
		}
		
		long ans = 1 + c2(A.length());
		for(int i=0;i<26;i++){
			if(alph[i]>=2){
				ans -= c2(alph[i]);
			}
		}
		
		System.out.println(ans);
		
		
	}
	
	private long c2(int a){
		return 1L * a * (a-1) / 2;
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}