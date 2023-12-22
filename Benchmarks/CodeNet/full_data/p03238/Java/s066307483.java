import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String args[]) throws IOException{
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1);
		int N = Integer.parseInt(reader.readLine());
		if(N == 1) {
			out.println("Hello World");
		}else {
			out.println(Integer.parseInt(reader.readLine()) + 
					Integer.parseInt(reader.readLine()));
		}
		out.flush();
	}

}