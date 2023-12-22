import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		String S = sc.next();

		sc.close();

		int ans = 0;

		for (int a = 0; a <= 9; a++) {
			int ia = S.indexOf(String.valueOf(a));
			if (ia == -1) {
				continue;
			}
			for (int b = 0; b <= 9; b++) {
				int ib = S.indexOf(String.valueOf(b), ia + 1);
				if (ib == -1) {
					continue;
				}

				for (int c = 0; c <= 9; c++) {
					int ic = S.indexOf(String.valueOf(c), ib + 1);
					if (ic != -1) {
						ans++;
					}
				}
			}
		}

		out.println(ans);
	}

//	//愚直
//	public void _main(String[] args) {
//		Scanner sc = new Scanner(in);
//
//		int N = sc.nextInt();
//		String S = sc.next();
//
//		sc.close();
//
//		Set<List<Character>> ans = new HashSet<>();
//
//		for(int a=0;a<N-2;a++) {
//			for(int b=a+1;b<N-1;b++) {
//				for(int c=b+1;c<N;c++) {
//					ans.add(Arrays.asList(S.charAt(a), S.charAt(b), S.charAt(c)));
//				}
//			}
//		}
//
//		out.println(ans.size());
//	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
