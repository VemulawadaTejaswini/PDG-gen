import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		int c = parseInt(sc.next());
		int k = parseInt(sc.next());
		sc.close();
		int mx = Math.max(a, Math.max(b, c));
		out.println(a+b+c+mx*((int)pow(2, k)-1));
	}
}
