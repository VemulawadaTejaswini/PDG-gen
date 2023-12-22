import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final char two = '2';
		int cnt = 0;
		
		assert(N>=1000 && N<10000);
		
		for (char c: Integer.toString(N).toCharArray()) {
			if(c==two) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
