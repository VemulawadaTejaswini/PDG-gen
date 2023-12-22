import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		String s = sc.next();
		sc.close();

		boolean flag1;

		for(int times = 1;times <= K;times++) {
			flag1 = false;
			for(int i = 2;i <= N;i++) {
				if(!mojime(s, i).equals( mojime(s, i - 1) )) {
					for(int j = i;j <= N;j++) {
						if(j == N || mojime(s, j + 1).equals(mojime(s, i - 1))) {
//							System.out.println(i);
//							System.out.println(j);
							s = hanten(s, i, j);

							flag1 = true;
							break;
						}
					}
				}
				if(flag1) break;
			}
			if(!flag1) times = K + 1;
		}
//		System.out.println(s);
		System.out.println(happy(s));

	}

	private static int happy(String s) {
		int N = s.length();
		if (N == 1)
			return 0;
		int happy = 0;

		if (mojime(s, 1).equals("R") && mojime(s, 2).equals("R"))
			happy++;
		for (int i = 2; i <= N - 1; i++) {
			if (mojime(s, i).equals("L")) {
				if (mojime(s, i - 1).equals("L"))
					happy++;
			} else {
				if (mojime(s, i + 1).equals("R"))
					happy++;
			}
		}
		if (mojime(s, N).equals("L") && mojime(s, N - 1).equals("L"))
			happy++;

		return happy;
	}

	private static String hanten(String s, int l, int r) {
		String output = s.substring(0, l - 1);

		for (int i = r; i >= l; i--) {
			output += mojime(s, i).equals("L") ? "R" : "L";
		}

		output += s.substring(r);
		return output;
	}

	/** i文字目を切り出す
	 */
	private static String mojime(String s, int i) {
		return s.substring(i - 1, i);
	}
}