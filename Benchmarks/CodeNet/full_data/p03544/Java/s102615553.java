import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		sc.close();
		long li2 = 2L;
		long ans = 1L;
		long tmp = 0L;
		for (i = 2; i <= n; i++) {
			tmp = ans + li2;
			li2 = ans;
			ans = tmp;
		}
		out.println(ans);
	}
}
