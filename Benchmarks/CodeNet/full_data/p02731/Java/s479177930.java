import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int l = parseInt(sc.next());
		sc.close();
		double ll = (double)l/3;
		out.printf("%.12f%n", ll*ll*ll);
	}
}
