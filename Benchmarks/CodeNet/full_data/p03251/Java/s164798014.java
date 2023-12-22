
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = X + 1;
		for(int i = 0; i < N; i++) {
			Z = Math.max(Z, sc.nextInt() + 1);
		}
		boolean flag = true;
		for(int i = 0; i < M; i++) {
			flag = flag && sc.nextInt() >= Z;
		}
		flag = flag && Y >= Z;
		if(flag) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
	}

}
