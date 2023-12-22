import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[] p = new int[M];
		String[] S = new String[M];
		for (int i = 0; i < M; i++) {
			p[i] = in.nextInt();
			S[i] = in.next();
		}
		int ans = 0;
		int penalty = 0;
		int index = 0;
		while (index < M) {
			int pro = p[index];
			if (S[index].equals("AC")) {
				ans++;
			} else {
				int tmpP = 1;
				int next = 1;
				while (index + next < M && p[index + next] == pro && S[index + next].equals("WA")) {
					tmpP++;
					next++;
				}
				if (index + next < M && p[index + next] == pro && S[index + next].equals("AC")) {
					penalty += tmpP;
					ans++;
				}
			}
			while (index < M && p[index] == pro) {
				index++;
			}
		}
		System.out.println(ans + " " + penalty);
		in.close();
	}
}