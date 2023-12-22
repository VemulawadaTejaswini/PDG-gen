import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long h = 0;
		long n = 0;
		long w = 0;
		if(N % 2 == 0) {
			h = N;
			n = N;
			w = N / 2;
		} else if(N % 3 == 0) {
			h = N / 3;
			n = N*2;
			w = N*2;
		}
		System.out.println(h+" "+n+" "+w);
	}
}