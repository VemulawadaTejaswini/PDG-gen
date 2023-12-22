import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			if(x == 2) {
				System.out.println(2);
				return;
			}
			for(int i = x ; true ; i++) {
				int max = i / 2 + 1;
				int j = 2;
				for(; j <= max ; j++) {
					if(i % j == 0) {
						break;
					}
				}
				if(j == max + 1) {
					System.out.println(i);
					break;
				}
			}

		}

	}

}
