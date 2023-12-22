import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int M = 10;
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		double x = parseDouble(sc.next());
		double y = parseDouble(sc.next());
		sc.close();
		out.println((int)(log(y/x)/log(2.0))+1);
	}
}
