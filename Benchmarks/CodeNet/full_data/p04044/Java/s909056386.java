
import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int L = Integer.parseInt(sc.next());
		String s[] = new String[N];
		String ans = "";
      
		for(int i = 0;i < N; i++) {
			s[i] = sc.next();
		}
		Arrays.sort(s);
		
		for(String ss : s) {
			ans += ss;
		}
		System.out.println(ans);
	}
}
