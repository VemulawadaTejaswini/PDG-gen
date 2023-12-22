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
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		sc.close();
		if(a[0] == 'D') {
			if(b[0] == 'H') {
				b[0] = 'D';
			} else {
				b[0] = 'H';
			}
		}
		out.println(b);
	}
}
