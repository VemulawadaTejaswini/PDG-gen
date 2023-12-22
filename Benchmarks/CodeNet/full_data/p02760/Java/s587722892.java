import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] card = new int[9];
		for(int i = 0; i < 9; i++) {
			card[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int b = sc.nextInt();
			for(int j = 0; j < 9; j++) {
				if(b == card[j]) {
					card[j] = 0;
				}
			}
		}

		for(int i = 0; i < 3; i++) {
			if(card[i] == 0) {
				if(card[i + 3] == 0 && card[i + 6] == 0) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}

		for(int i = 0; i < 9; i+=3) {
			if(card[i] == 0) {
				if(card[i + 1] == 0 && card[i + 2] == 0) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}

		if(card[4] == 0) {
			if(card[0] == 0 && card[8] == 0) {
				System.out.println("Yes");
				System.exit(0);
			}else if(card[2] == 0 && card[6] == 0) {
				System.out.println("Yes");
				System.exit(0);
			}
		}

		System.out.println("No");
		sc.close();
	}
}
