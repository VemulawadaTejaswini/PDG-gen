import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final long MOD = 1000000007;
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		int sum=0;
		for (i = 0; i < n; i++) {
			a[i] = parseInt(sc.next());
			sum+=a[i];
		}
		sc.close();
		int ave = (int) round((double)sum / n);
		int ans = 0;
		for (i = 0; i < n; i++) {
			ans+=(a[i]-ave)*(a[i]-ave);
		}
		out.println(ans);
	}
}
