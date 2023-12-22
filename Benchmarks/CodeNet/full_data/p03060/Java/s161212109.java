import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		B(sc);
	}
	
	public static void A(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		int ret = ((int)(t+0.5)/a)*b;
		out.println(ret);
	}
	
	public static void B(Scanner sc) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int N = sc.nextInt();
		int[] subs = new int[N];
		for(int i=0;i<N;i++) {
			subs[i] = sc.nextInt();
 		}
		for(int i=0;i<N;i++) {
			subs[i] -= sc.nextInt();
			if(subs[i]>0) sum+=subs[i];
		}
		out.println(sum);
		
	}
}
