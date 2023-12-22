import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		sc.close();
		double x = (double)n / 1.08;
		out.println(n==(int)((int)(x)*1.08)?(int)x:(n==(int)((int)(x+1)*1.08))?(int)(x+1):":(");
	}
}
