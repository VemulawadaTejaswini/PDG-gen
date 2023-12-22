import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		int c = parseInt(sc.next());
		sc.close();
		boolean f = false;
		int aa = 0;
		for(i=1;i<b;i++) {
			aa += a;
			if(aa%b==c) {
				f = true;
				break;
			}
		}
		out.println(f?"YES":"NO");
	}
	
}
