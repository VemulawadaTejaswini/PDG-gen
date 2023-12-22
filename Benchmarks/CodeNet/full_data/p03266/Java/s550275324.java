import java.util.*;
//import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		long k = parseLong(sc.next());
		sc.close();
		long a1 = n / k;
		long a2 = 0;
		if(k%2==0) {
			a2 = (n + k /2) / k; 
		}
		out.println(a1*a1*a1+a2*a2*a2);
	}
}
