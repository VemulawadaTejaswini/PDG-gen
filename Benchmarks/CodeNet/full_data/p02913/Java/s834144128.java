import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		int r = 0;
		String s = ""+S.charAt(0);
		long ans = 0;
		for(int l=0;l<N;l++) {
			while(l>r)r++;
			while(r+1<N && S.lastIndexOf(s + S.charAt(r+1))>r) {
				s += S.charAt(r+1);
				r++;
			}
			ans = Math.max(r-l,ans);
			if(s.length()>2) s = s.substring(1);
			else if (s.length()==1) s = "";
		}
		System.out.println(ans);
	}
}
