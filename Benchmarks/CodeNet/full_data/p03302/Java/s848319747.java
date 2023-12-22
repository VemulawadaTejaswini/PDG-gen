import java.util.*;

public class Main {

	public static void main(String[] args) {
		// make new Scanner.
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		
		if (n + t == 15 || n * t == 15) {
			System.out.println('*');
		} else {
			System.out.println('x');
		}
		
		// Listに格納.
//		List<Integer> list = inList(sc,n);
		

		// close Scanner
		sc.close();

	}