import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s[] = new String[N];
			for(int i = 0; i < N; i++) {
				s[i] = sc.next();
			}
		int M = sc.nextInt();
		String t[] = new String[M];
			for(int j = 0; j < M; j++) {
				t[j] = sc.next();
			}

			int[] point = new int[N];
				for(int k = 0; k < N; k++) {
					int p = 0;
					for(int l = 0; l < N; l++) {
						if(s[l].equals(s[k])) {
							p += 1;
						}
					}
				for(int m = 0; m < N; m++) {
					for(int n = 0; n < M; n++) {
						if(s[m].equals(t[n])) {
							p -= 1;
						}
					}
				}
					point[k] = p;
				}

		int max = 0;
			for(int k = 0; k < N; k++) {
				if(point[k] > max) {
					max = point[k];
				}else {
					max = max;
				}
			}

		System.out.println(max);
	}

}
