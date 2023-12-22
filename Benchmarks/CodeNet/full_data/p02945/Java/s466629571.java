import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int MAX;
		if(A+B > A-B) {
			if(A+B > A*B) {
				MAX= A+B;
			} else {
				MAX = A*B;
			}
		} else {
			if(A-B > A*B) {
				MAX = A-B;
			} else {
				MAX = A*B;
			}
		}
		System.out.println(MAX);
	}
}