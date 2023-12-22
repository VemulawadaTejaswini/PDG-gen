import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i=N; 0<i; i--) {
			for (int j=0; j<N; j++) {
				if (i == Math.pow(2, j)) {
					System.out.println(i);
					return;
				}
			}
		}
	}
}
