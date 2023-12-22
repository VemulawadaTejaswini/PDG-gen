import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		B(sc);
	}
	
	public static void A(Scanner sc) {
		String s = sc.next();
		out.println(s.substring(0,3) + 8 + s.substring(4,10));
	}
	
	public static void B(Scanner sc) {
		int N = sc.nextInt();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<N;i++) set.add(sc.nextInt());
		out.println(set.size());
	}
}
