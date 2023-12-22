import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int m = 0;
		for(int i=0; i<N; i++){
			m += Integer.parseInt(sc.next());
		}
		System.out.println((int)Math.floor(X/m));
	}
}