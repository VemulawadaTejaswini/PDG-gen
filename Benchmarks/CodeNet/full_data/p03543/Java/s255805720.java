import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);

		String N = sc.next();

		if(N.charAt(0) == N.charAt(1) && N.charAt(1) == N.charAt(2) || N.charAt(2) == N.charAt(3) && N.charAt(1) == N.charAt(2)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}