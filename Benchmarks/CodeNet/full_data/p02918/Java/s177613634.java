import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		String S = sc.next();
		char first = S.charAt(0);
		int index = -1;
		for (int i=0;i<N;i++) {
			if (S.charAt(i)!=first) {
				if (i==N-1) {
					K--;
					index = i-1;
				} else if (S.charAt(i+1)!=first) {
					continue;
				} else {
					K--;
					if (K==0) {
						index = i;
						break;
					}
				}
			} else {
				continue;
			}
		}

		int ans = index+1;
		if (index+1<N) {
			char before = S.charAt(index+1);
			for (int i=index+2;i<N;i++) {
				if (S.charAt(i)==before) {
					ans++;
				}
				before = S.charAt(i);
			}
		}
		// System.out.println(N);
		// System.out.println(index);
		System.out.println(ans);
	}
}