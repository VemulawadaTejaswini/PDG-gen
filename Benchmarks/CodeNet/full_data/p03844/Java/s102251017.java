import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int N = 3;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long a = parseLong(sc.next());
		char[] op = sc.next().toCharArray();
		long b = parseLong(sc.next());
		sc.close();
		out.println(op[0]=='+'?a+b:a-b);
	}
}
