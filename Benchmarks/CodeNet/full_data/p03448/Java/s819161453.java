
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int A;
	int B;
	int C;
	int X;
	public void run() {
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		X = sc.nextInt();
		int cnt=0;
		for(int i=0; i<=A; i++) {
			for(int j=0; j<=B; j++) {
				for(int k=0; k<=C; k++) {
					if(500*i + 100*j + 50*k == X) cnt++;
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
