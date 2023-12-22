import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long a = parseLong(sc.next());
		long b = parseLong(sc.next());
		long c = parseLong(sc.next());
		sc.close();
		long ans = 0;
		if(a%2==1&b%2==1&c%2==1) {
			ans = Math.min(Math.min(a*b, b*c),c*a);
		}
		out.println(ans);
	}
}
