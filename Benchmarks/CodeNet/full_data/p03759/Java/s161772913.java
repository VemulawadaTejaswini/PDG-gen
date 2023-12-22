import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("src/input.txt");
		PrintStream out = new PrintStream("src/output.txt");

		//System.setOut(out);

		sc = new Scanner(in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(b - a == c - b){
			System.out.println("OK");
		}else{
			System.out.println("NG");
		}

		out.close();
	}
}