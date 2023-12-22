import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		B(sc);
	}
	
	public static void A(Scanner sc) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		if(N%500 <=A) out.println("Yes");
		else out.println("No");
	}
	
	public static void B(Scanner sc) {
		int N = sc.nextInt();
		int ret = 0;
		Integer[] a = new Integer[N];
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a,Collections.reverseOrder());
		for(int i=0;i<N;i++) {
			if(i%2==0) ret+=a[i];
			else ret-=a[i];
		}
		out.println(ret);
	}
}