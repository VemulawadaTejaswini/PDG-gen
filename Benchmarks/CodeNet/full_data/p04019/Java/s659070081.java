import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String path = r.readLine();
		int p = 0;
		for (int j = 0; j < path.length(); j++)
			p |= (path.charAt(j) == 'S' ? 1 : path.charAt(j) == 'N' ? 2 : path.charAt(j) == 'W' ? 4 : 8);
		System.out.println(p == 3 || p == 12 || p == 15 ? "Yes" : "No");
	}

}