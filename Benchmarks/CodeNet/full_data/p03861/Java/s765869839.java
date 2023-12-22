import java.util.*;
import java.text.DecimalFormat;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble(), b=sc.nextDouble(), x=sc.nextDouble();
		double t = (Math.floor(b/x)-Math.ceil(a/x)+1)>0 ? (Math.floor(b/x)-Math.ceil(a/x)+1) : 0;
		System.out.println(new DecimalFormat("#").format(t));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}