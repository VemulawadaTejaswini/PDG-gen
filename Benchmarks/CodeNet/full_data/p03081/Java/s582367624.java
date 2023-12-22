import java.util.*;

class Main {

	static int N;
	static int Q;
	static char[] d;
	static char[] t;
	static String s;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Q = sc.nextInt();
		s = sc.next();
		t = new char[Q];
		d = new char[Q];
		for (int i=0;i<Q;i++) {
			t[i]=sc.next().charAt(0);
			d[i]=sc.next().charAt(0);
		}
		int left_edge=0;
		int right_edge=N-1;

		int left = 0;
		int right = N-1;
		do {
			if (test(N-1)=='A') {
				right_edge=N;
				break;
			}
			int center = (left + right) / 2;
			if (center==0) {
				if (test(center)=='R') {
					right_edge=center+1;
					break;
				} else if (test(center)=='A' || test(center)=='L'){
					left = center + 1;
				} else {
					right = center - 1;
				}
			}
			if (test(center)=='R' && (test(center-1)=='A' || test(center-1)=='L')) {
				right_edge=center;
				break;
			} else if (test(center)=='A' || test(center)=='L'){
				left = center + 1;
			} else {
				right = center - 1;
			}
		} while (left <= right);

		left = 0;
		right = N-1;
		do {
			if (test(0)=='A') {
				left_edge=-1;
				break;
			}
			int center = (left + right) / 2;
			if (center==N-1) {
				if (test(center)=='L') {
					left_edge=center-1;
					break;
				} else if (test(center)=='A' || test(center)=='R'){
					right = center - 1;
				} else {
					left = center + 1;
				}
			}
			if (test(center)=='L' && (test(center+1)=='A' || test(center+1)=='R')) {
				left_edge=center;
				break;
			} else if (test(center)=='A' || test(center)=='R'){
				right = center - 1;
			} else {
				left = center + 1;
			}
		} while (left <= right);
		System.out.println(right_edge-left_edge-1);
	}

	static char test(int n) {
		int tmp = n;
		for (int i=0;i<Q;i++) {
			if (s.charAt(tmp)==t[i]) {
				if (d[i]=='R') {
					tmp++;
				} else if (d[i]=='L') {
					tmp--;
				}
			}
			if (tmp<0) {
				return 'L';
			}else if(tmp>N-1) {
				return 'R';
			}
		}
		return 'A';
	}
}