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
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		int x;
		int sum = 0;
		for(i=0;i<n;i++) {
			x = parseInt(sc.next());
			sum += Math.min(x, abs(x-k))*2;
		}
		sc.close();
		out.println(sum);
	}
}
