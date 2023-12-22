import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);
		int N = sc1.nextInt();
		int Q = sc1.nextInt();
		String s = sc1.next();
		String[] t = new String[Q];
		String[] d = new String[Q];
		int[] G = new int[N];

		for ( int i = 0 ; i < N ; i++ ) {
			G[i] = 1;
		}



		for ( int i = 0 ; i < Q ; i++ ) {
			t[i] = sc1.next();
			//System.out.println(t[i]);
			d[i] = sc1.next();
			//System.out.println(d[i]);

			if (d[i].equals("L")) {
				int j = -1;
				while(s.indexOf(t[i], j+1) >= 0) {
					j = s.indexOf(t[i], j+1);
					int tmp = G[j];
					G[j] = 0;
					if ( j > 0) {
						G[j-1] += tmp;
					}
					//System.out.println("test1");
				}
			}
			else {
				int j = N;
				while(s.lastIndexOf(t[i], j-1) >= 0) {
					j = s.lastIndexOf(t[i], j-1);
					int tmp = G[j];
					G[j] = 0;
					if ( j < N-1) {
						G[j+1] += tmp;
					}
					//System.out.println("test2");
				}
			}
		}

		int ans = 0;

		for ( int i = 0 ; i < N ; i++ ) {
			ans += G[i];
		}

		System.out.println(ans);

		sc1.close();

	}

}