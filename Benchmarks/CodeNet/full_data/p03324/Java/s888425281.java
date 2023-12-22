import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int c = 0;
		int v = 0;
		while(c<N) {
			v++;
			int t = v;
			int d = 0;
			while(t%100 == 0) {
				t = t/100;
				d++;
			}
			if (d == D)  c++;
		}
		System.out.println(v);
	}
}
