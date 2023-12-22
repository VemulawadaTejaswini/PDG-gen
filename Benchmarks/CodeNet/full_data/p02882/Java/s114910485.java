import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		int x = parseInt(sc.next());
		sc.close();
		double v = (double)a*a*b;
		double ans = 0.0d;
		if(v/2<=x) {
			ans = atan((((v-x)/(a*a))*2)/a);
		} else {
			ans = atan((double)b/((((double)x/b)/a)*2));
		}
		out.println(toDegrees(ans));
	}
}
