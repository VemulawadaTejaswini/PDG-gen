import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * --------------------------------------------------
 * Main Class
 * --------------------------------------------------
 */
public class Main {

	public void exec() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int a = input.nextInt();
		int b = input.nextInt();
		boolean ret = false;
		if(a%3==0 || b%3==0 || (a+b)%3==0){
			ret=true;
		}
		out.println(ret ? "Possible":"Impossible");
		out.flush();
		input.close();
	}

	public static void main(String[] args) throws IOException {
//		long time = System.currentTimeMillis();
		new Main().exec();
//		System.out.println(System.currentTimeMillis() - time);
	}
}
