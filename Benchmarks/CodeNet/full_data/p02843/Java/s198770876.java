import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int x = parseInt(sc.next());
		sc.close();
		int ix=x/100;
		int jx=x/101;
		int kx=x/102;
		int lx=x/103;
		int mx=x/104;
		boolean f=false;
LABEL:	for (int i = 0; i <= x; i+=100) {
			for (int j = 0; j <= x-i; j+=101) {
				for (int k = 0; k <= x-i-j; k+=102) {
					for (int l = 0; l <= x-i-j-k; l+=103) {
						for (int m = 0; m <= x-i-j-k-l; m+=104) {
							int tmp = x-i-j-k-l-m;
							if(tmp>=0 && tmp%105==0) {
								f=true;
								break LABEL;
							}
						}
					}
				}
			}
		}
		out.println(f?1:0);
	}
}
