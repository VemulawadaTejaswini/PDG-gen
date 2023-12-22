import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		boolean n = false, s = false, e = false, w = false, answer = false;
		if (line.contains("N"))
			n = true;
		if (line.contains("S"))
			s = true;
		if (line.contains("E"))
			e = true;
		if (line.contains("W"))
			w = true;
		if (n && s && e && w)
			answer = true;
		else if (n && s && e == false && w == false)
			answer = true;
		else if (e && w && n == false && s == false)
			answer = true;

		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
