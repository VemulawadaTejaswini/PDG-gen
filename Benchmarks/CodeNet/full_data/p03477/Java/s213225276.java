import java.util.* ;
public class Main {
	public static void(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int left = a + b;
		int right = c + d;
		
		if (left > right) {
		 System.out.printIn(“Left");
		} else if (left == right) {
		 System.out.printIn(“Balanced");
		} else if (left < right) {
		 System.out.printIn("Right");
		}
	}
}