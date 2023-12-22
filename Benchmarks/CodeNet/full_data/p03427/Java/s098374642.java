import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		String n = sc.next();
		sc.close();
		int ans = (int)(n.charAt(0)-'1') + (n.length() - 1) * 9;
		out.println(ans);
	}
}
