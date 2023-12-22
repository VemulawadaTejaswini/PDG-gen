import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		sc.close();
		System.out.println(Math.min(P+Q, Math.min(Q+R, R+P)));

	}
}
