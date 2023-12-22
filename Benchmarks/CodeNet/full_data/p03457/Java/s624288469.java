import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] t = new int[n+1];
		int[] x = new int[n+1];
		int[] y = new int[n+1];
		for (i = 1; i <= n; i++) {
			t[i] = parseInt(sc.next());
			x[i] = parseInt(sc.next());
			y[i] = parseInt(sc.next());
		}
		sc.close();
		int dt=0;
		int dxy=0;
		boolean f = true;
		for (i = 0; i < n; i++) {
			dt = t[i+1] - t[i];
			dxy = abs(x[i+1] - x[i])+abs(y[i+1] - y[i]);
			if(dxy > dt) {
				f = false;
				break;
			}
			if((dt-dxy)%2!=0) {
				f = false;
				break;
			}
		}
		out.println(f?"Yes":"No");
	}
}
