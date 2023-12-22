import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		sc.close();
		int ans = (X/500)*1000+(X%500)/5*5;
		System.out.println(ans);

	}
}
