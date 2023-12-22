import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int A = sc.nextInt();

		if(H%A==0) {
			System.out.println(H/A);
		} else {
			System.out.println(H/A+1);
		}

	}
}
