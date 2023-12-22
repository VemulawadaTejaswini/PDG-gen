import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] p = new int[n];
		for(i=0;i<n;i++) {
			p[i] = parseInt(sc.next());
		}
		sc.close();
		int cnt=1;
		for (i = 1; i < n; i++) {
			if(p[i]<=p[i-1]) cnt++;
		}
		out.println(cnt);
	}
}
