import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		String[] even;
		String[] odd = new String[n / 2];;;
		if (n % 2 == 0)
			even = new String[n / 2];
		else
			even = new String[n / 2 + 1];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				even[i / 2] = sc.next();
			else
				odd[i / 2] = sc.next();
		}
		if (n % 2 == 0) {
			for (int i = n / 2 - 1; i >= 0; i--)
				out.print(odd[i] + " ");
			for (int i = 0; i < n / 2 - 1; i++)
				out.print(even[i] + " ");
			if (n / 2 - 1 >= 0)
				out.println(even[n / 2 - 1]);
			else
				out.println();
		}
		else {
			for (int i = n / 2; i >= 0; i--)
				out.print(even[i] + " ");
			for (int i = 0; i < n / 2 - 1; i++)
				out.print(odd[i] + " ");
			if (n / 2 - 1 >= 0)
				out.println(odd[n / 2 - 1]);
			else
				out.println();
		}
		out.flush();
	}
}