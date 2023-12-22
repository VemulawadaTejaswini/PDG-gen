import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] n = sc.next().toCharArray();
		sc.close();
		out.println(n[0]=='7'||n[1]=='7'||n[2]=='7'?"Yes":"No");
	}
}
