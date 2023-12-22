import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int K = reader.nextInt();
		String S = reader.next();

		for (int i = 0; i < N; i++) {
			char cha = S.charAt(i);
			if (i == K-1) {
				char small_cha = Character.toLowerCase(cha);
				System.out.print(small_cha);
			} else {
				System.out.print(cha);
			}

		}

		reader.close();

	}

}
