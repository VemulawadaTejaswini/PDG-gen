import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		String[] s = new String[N];
		for (int i = 0; i < N; i++)
			s[i] = sc.next();
		int M = sc.nextInt();
		String[] t = new String[M];
		for (int i = 0; i < M; i++)
			t[i] = sc.next();
		sc.close();

		int ans = 0;

		for (int i = 0; i < N; i++) {
			int tem = 0;
			for (int j = 0; j < N; j++)
				if (s[i].equals(s[j]))
					tem++;
			for (int j = 0; j < M; j++)
				if (s[i].equals(t[j]))
					tem--;
			if (tem > ans)
				ans = tem;
		}

		System.out.println(ans);
	}
}