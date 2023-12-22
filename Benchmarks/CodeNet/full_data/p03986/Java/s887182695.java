import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
//		String x = sc.next();
		StringBuilder x = new StringBuilder(sc.next());
		sc.close();
		int len = x.length();
		int cnt=0;
		int p=0;
		while((p=x.indexOf("ST",p))>=0) {
			x.delete(p, p+2);
			cnt++;
			if(p!=0)p--;
		}
		out.println(len - cnt*2);
	}
}
