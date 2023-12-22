import java.util.*;
//import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		sc.close();
		StringBuilder sb = new StringBuilder();
		long sho = n;
		while(sho != 0) {
			long amari = sho % -2;
			sho /= -2;
			if(amari < 0) {
				amari=-amari;
				sho++;
			}
			sb.insert(0, (char)('0'+amari));
		}
		out.println(sb.length()==0?"0":sb.toString());
	}
}