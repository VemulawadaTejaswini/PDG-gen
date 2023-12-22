import java.util.*;

public class Main {
	static long L;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		L = sc.nextLong();
		String[] s = new String[N];
		for(int i=0; i<N; i++)
			s[i] = sc.next();
		
		Arrays.sort(s);

		long xor=0;
		xor ^= move("", s[0]);
		for(int i=0; i<N-1; i++) {
			xor ^= move(s[i], s[i+1]);
		}
		xor ^= move(s[N-1], "");
		
		System.out.println(xor==0 ? "Bob" : "Alice");
		sc.close();
	}
	
	static long move(String s, String t) {
		String prefix = getPrefix(s, t);
		return up(s, prefix) ^ down(prefix, t);
	}
	
	static long up(String s, String t) {
		long ans = 0;
		for(int i=s.length()-1; i>=t.length(); i--) {
			if(s.charAt(i)=='0')
				ans ^= (L-i)%2+1;
		}
		return ans;
	}
	
	static long down(String s, String t) {
		long ans = 0;
		for(int i=s.length(); i<t.length(); i++) {
			if(t.charAt(i)=='1')
				ans ^= (L-i)%2+1;
		}
		return ans;
	}
	
	static String getPrefix(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s1.length() && i<s2.length() && s1.charAt(i)==s2.charAt(i); i++)
			sb.append(s1.charAt(i));
		
		return sb.toString();
	}
}
