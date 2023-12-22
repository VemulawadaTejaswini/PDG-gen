import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		boolean check = false;
		if(N >= 4) {
			for(int i = 0; i <= N / 7; i++) {
				int rest = N - 7 * i;
				if(rest % 4 == 0) {
					check = true;
					break;
				}else {
					continue;
				}
			}
		}
		if(check) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}