import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	 
	public static void main(String[] args) throws IOException {
		Main main = new Main();
		main.run();
	}
 
	private void run() throws IOException {
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		if(s.substring(2,3).equals(s.substring(3,4)) && s.substring(4,5).equals(s.substring(5,6))) {
			out.println("Yes");
		}else {
			out.println("No");
		}
		out.flush();
		br.close();
	}
}