import java.io.PrintWriter;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int sum = n*l +  (1+n)/2 - n;
		if(l>0) sum -= l;
		else sum -= l+n-1;
		out.println(sum);

		out.flush();
	}
}
