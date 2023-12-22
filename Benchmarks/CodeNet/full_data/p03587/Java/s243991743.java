import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main{
	static Scanner sc;

	static String S;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;
		//PrintStream out = new PrintStream("src/output.txt");

		//System.setOut(out);

		sc = new Scanner(in);

		S = sc.next();

		int answer = 0;
		for(int i = 0; i < S.length(); i++){
			if(S.charAt(i) == '1'){
				answer++;
			}
		}

		System.out.println(answer);
	}
}