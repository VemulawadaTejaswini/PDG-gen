import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}
	
	public void exec() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String S = br.readLine();
		int i=1;
		for(char c: S.toCharArray()) {
			if(i%2==1){
				out.print(c);
			}
			i++;
		}
		out.println("");
		out.flush();
	}
	
}