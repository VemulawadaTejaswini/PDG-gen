import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		char[] s = sc.next().toCharArray();
		int K = sc.nextInt();
		int N = s.length;
		
		for(int i=0; i<N; i++) {
			if(s[i]!='a' && 'z'-s[i]+1 <= K) {
				K -= 'z'-s[i]+1;
				s[i] = 'a';
			}
		}
		s[N-1] = (char)('a'+(((s[N-1]-'a')+K)%26));
		
		pw.println(s);
		
		sc.close();
		pw.close();
	}
}
