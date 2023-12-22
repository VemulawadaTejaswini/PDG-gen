import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		if(M==0) {
			System.out.println(-1);
			sc.close();
			return;
		}

		String[] temp = new String[N];
		for (int i = 0; i < M; i++) {

			int s = sc.nextInt();
			int c = sc.nextInt();

			temp[s-1] = String.valueOf(c);
		}

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < N; i++) {

			if(temp[0].equals("0")) {
				result.append("1");
			}

			if(temp[i] != null) {
				result.append(temp[i]);
			} else {
				result.append("0");
			}
		}

		int resultInt = Integer.parseInt(result.toString());
		if(N ==1 && resultInt == 0) {
			System.out.println(0);
			sc.close();
			return;
		}

		if((int)Math.pow(10, N-1) <= resultInt && (int)Math.pow(10, N) > resultInt) {
			System.out.println(Integer.parseInt(result.toString()));
		} else {
			System.out.println(-1);
		}

		sc.close();
	}
}