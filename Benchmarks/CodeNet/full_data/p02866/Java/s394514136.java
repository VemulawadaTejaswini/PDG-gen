import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 998244353;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] d = new int[n];
		for(i=0;i<n;i++) {
			d[i] = parseInt(sc.next());
		}
		sc.close();
		int ans=0;
		if(d[0]==0) {
			ans=1;
			for (i = 1; i < n; i++) {
				ans*=d[i];
				if(ans>=MOD)ans%=MOD;
			}
		}
		out.println(ans);
	}
}
