import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int A = sc.nextInt();
		sc.close();
		if(X<A) {
			System.out.println("0");
		} else {
			System.out.println("10");
		}
	}
}