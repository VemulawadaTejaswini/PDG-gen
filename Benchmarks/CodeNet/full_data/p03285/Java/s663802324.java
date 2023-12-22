import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j, k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		sc.close();
		boolean f = false;
LABEL:	for (i = 0; i <= 25; i++) {
			for (j = 0; j < 14; j++) {
				if(n==4*i+7*j) {
					f = true;
					break LABEL;
				}
			}
		}
		out.println(f?"Yes":"No");
	}
}
