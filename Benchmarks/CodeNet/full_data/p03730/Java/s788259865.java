import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int p = a % b;
		int n = p;
		while (true) {
			n = (n + n) % b;
			if(n == p){
				System.out.println("NO");
				break;
			}else if( n == c){
				System.out.println("YES");
				break;
			}
		}
	}
}