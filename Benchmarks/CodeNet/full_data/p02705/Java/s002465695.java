
import java.util.*;
import java.io.*;

public class Main {
	// https://atcoder.jp/contests/abc163/tasks/abc163_a
	
	public static void main(String[] args) throws IOException, FileNotFoundException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader in = new BufferedReader(new FileReader("CirclePond"));

		int r = Integer.parseInt(in.readLine());  
		System.out.println(2 * r * Math.PI);

	}

}
