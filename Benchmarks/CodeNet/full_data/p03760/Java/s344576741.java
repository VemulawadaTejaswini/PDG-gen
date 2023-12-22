import java.util.*;;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String o = sc.next();
		String e = sc.next();
		int O = o.length();
		int E = e.length();
		for (int i = 0; i < O; i++) {
			if (i < O) {
				System.out.print(o.charAt(i));
			}
			if (i < E) {
				System.out.print(e.charAt(i));
			}
		}
	}
}