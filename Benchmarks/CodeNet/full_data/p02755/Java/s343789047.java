import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean flg = false;
		for (int i = 1; i < 1269; i++) {
			if (Math.floor(i * 0.08) == A && Math.floor(i * 0.10) == B) {
				System.out.println(i);
				flg=true;
				break;
			}
		}
		if (flg == false) {
			System.out.println("-1");
		}
	}
}