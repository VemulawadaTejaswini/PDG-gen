import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int H = sc.nextInt();
		final int W = sc.nextInt();
		int cnt = 0;
		for (int i=0; i< N; i++) {
			int Ai = sc.nextInt();
			int Bi = sc.nextInt();
			if(Ai>=H && Bi>=W) {
				cnt++;
			}			
		}
		System.out.println(cnt);
		sc.close();
	}

}
