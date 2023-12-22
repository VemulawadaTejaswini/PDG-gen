import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int pos = 0;


		for (int i = 0; i < H; i++) {
			char A[] = sc.next().toCharArray();
			for (int j = 0; j < W; j++) {
				if (A[j] == '#'){
					if (i < pos) {
						System.out.println("Impossible");
						System.exit(0);
					}
					pos = j;
				}
			}
		}




		System.out.println("Possible");


		sc.close();
	}


}
