import java.util.*;
//import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long k = parseLong(sc.next());
		sc.close();
		long k2 = k / 2;
		out.println(k2*(k2+k%2));
	}
}
