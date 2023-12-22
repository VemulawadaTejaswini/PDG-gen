import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		char c = sc.next().charAt(0);
		c++;
		out.println(c);

		out.close();
	}
}