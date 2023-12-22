import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n+1];
		for (int i = 1; i < a.length; i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		a[0] = 10001;
		int cnt=0;
		int doshoku=0;
		for (int i = 1; i < a.length; i++) {
			if(a[i-1]==a[i]) {
				doshoku++;
			} else {
				cnt+=doshoku/2;
				doshoku=1;
			}
		}
		cnt+=doshoku/2;
		out.println(cnt);
	}
}
