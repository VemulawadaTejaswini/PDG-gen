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
		int x = parseInt(sc.next());
		sc.close();
		int sq = (int)sqrt(x);
		int mx = 0;
		int sisu=0;
		int jo=0;
		for (i = 1; i <= sq; i++) {
			sisu = (int)(log(x)/log(i));
			jo=(int)pow(i,sisu);
			if(jo>mx)mx=jo;
		}
		out.println(mx);
	}
}
