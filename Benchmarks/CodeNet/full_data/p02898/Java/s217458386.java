import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		int[] h = new int[n];
		int cnt=0;
		for(i=0;i<n;i++) {
			h[i] = parseInt(sc.next());
			if(h[i]>=k)cnt++;
		}
		sc.close();
		out.println(cnt);
	}
}
