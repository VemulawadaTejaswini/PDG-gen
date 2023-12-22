import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();
		for(int i = 0;i < N;i++) {
			for(int j = 0; j < N;j++) {
				if(i * 4 + j * 7 == N) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}