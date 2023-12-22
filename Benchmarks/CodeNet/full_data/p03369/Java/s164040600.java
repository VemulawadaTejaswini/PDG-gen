import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		//PrintStream out = new PrintStream("src/output.txt");

		//System.setOut(out);

		sc = new Scanner(in);

		String S = sc.next();
		int answer = 700;

		for(int i = 0; i < 3; i++){
			if(S.charAt(i) == 'o'){
				answer += 100;
			}
		}
		System.out.println(answer);

		//out.close();
	}
}