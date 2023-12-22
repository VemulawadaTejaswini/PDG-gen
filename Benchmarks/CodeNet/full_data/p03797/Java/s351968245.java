import java.util.*;
import java.text.DecimalFormat;
// warm-up
// Not sure if this will fix it. 
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		double n=sc.nextDouble(), m=sc.nextDouble(), t=0;
		if (m<n) t=m/2;
		else {
			t+=n-((2*n==m) ? 0 : Math.floor((2*n)/m)); 
			m-=(n*2); 
			t+=(int)(m/4);
		}
		System.out.println(new DecimalFormat("#").format(t));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}