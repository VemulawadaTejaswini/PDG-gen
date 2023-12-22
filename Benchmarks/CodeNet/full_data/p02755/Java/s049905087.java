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
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		sc.close();
		int al = (int) ceil(a*12.5);
		int ah = (int) ceil((a+1)*12.5)-1;
		int bl = b*10;
		int bh = (b+1)*10-1;
//		out.printf("%d,%d,%d,%d%n", al, ah, bl, bh);
		int ans = -1;
		int ml = Math.max(al, bl);
		int mh = Math.min(ah, bh);
		if(ml <= mh) {
			ans = ml;
		}
		out.println(ans);
	}
}
