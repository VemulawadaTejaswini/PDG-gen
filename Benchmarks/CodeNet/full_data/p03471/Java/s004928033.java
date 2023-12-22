import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		
		for (int i = 0; i <= N; i++) {
			int x = i * 10_000;
			for (int j = N - i; j >= 0; j--) {
				int y = j * 5_000;
				int z = (N - (j + i)) * 1000;
				if (x + y + z == Y) {
					System.out.println(i + " " + j + " " + (N - (j + i)));
					return;
				}
			}
		}
		
		System.out.println("-1 -1 -1");
	}
}
