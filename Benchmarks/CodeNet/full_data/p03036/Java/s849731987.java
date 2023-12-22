import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		int r,d;
		ArrayList<Integer> x = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		d = sc.nextInt();
		x.add(sc.nextInt());
		for (int i = 1; i <= 10; ++i) {
			x.add(r * x.get(i - 1) - d);
			out.println(x.get(i));
		}
		sc.close();
	}
}
