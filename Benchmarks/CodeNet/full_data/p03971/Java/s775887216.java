import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		String text = sc.nextLine();
		char[] list = new char[N];

		for(int i = 0; i < N; i++){
			list[i] = text.charAt(i);
		}

		int y = 0;
		int passer = 0;

		for(int i = 0; i < N; i++ ) {
			if(list[i] == 'a') {
				if(passer < A + B) {
					System.out.println("Yes");
					passer ++;
				} else {
					System.out.println("No");
				}

			} else if(list[i] == 'b') {
				y ++;
				if(passer < A + B && y <= B) {
					System.out.println("Yes");
					passer ++;
				} else {
					System.out.println("No");
				}

			} else {
				System.out.println("No");
			}
		}
	}
}
