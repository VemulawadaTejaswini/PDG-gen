import java.io.*;

public class Main {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		
		try {
			String stA = reader.readLine();
			int A = Integer.parseInt(stA);
			
			String stB = reader.readLine();
			int B = Integer.parseInt(stB);
			
			int S = A * B - A - B + 1;
			System.out.println(S);
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
