import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[]arg) throws IOException{
		new Main().read();
	}

	public void read() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N,A;
		N = Integer.parseInt(in.readLine());
		A = Integer.parseInt(in.readLine());
		System.out.println(N*N - A);
	}
}