import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
	Main m = new Main();
	m.solve();
    }

    private void solve() throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int[] nm = Arrays.stream(br.readLine().split("[\\s]+"))
	    .mapToInt(Integer::parseInt).toArray();
	int n = nm[0];
    	int m = nm[1];
	String S = br.readLine();
	String T = br.readLine();
	br.close();
	int gcd = n > m ? gcd(n,m) : gcd(m,n);
	long lcm = (long)n*(long)m/(long)gcd;
	for (int i=0;i<n;i++) {
	    if (((long)i*(long)m)%(long)n != 0) continue;
	    long j = ((long)i*(long)m)/(long)n;
	    if ((int)j == m) continue;
	    char s = S.charAt(i);
	    char t = T.charAt((int)j);
	    if (s != t) {
		System.out.println(-1);
		System.exit(0);
	    }
	}
	System.out.println(lcm);
    }

    private int gcd(int n,int m) {
	if (n%m == 0) return m;
	return gcd(m,n-m*(n/m));
    }
}