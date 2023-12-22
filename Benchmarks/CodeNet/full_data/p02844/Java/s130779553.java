import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String A[] = new String[N];
		for(int i = 0; i <= N-1; i++) {
			A[i] = S.substring(i, i+1);
		}
		int B[] = new int[1000];
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(Integer.parseInt(A[i]) == 0) {
				for(int j = i+1; j < N; j++) {
					if(Integer.parseInt(A[j]) == 0) {
						for(int k = 0; k <= 9; k++) {
							for(int l = j+1; l < N; l++) {
								if(Integer.parseInt(A[l]) == k) {
									B[k] = 1;
									break;
								}
							}
						}
					}
				}
			}
		}
		for(int i = 0; i < N; i++) {
			if(Integer.parseInt(A[i]) == 0) {
				for(int j = 1; j <= 9; j++) {
					for(int k = i+1; k < N; k++) {
						if(Integer.parseInt(A[k]) == j) {
							for(int l = 0; l <= 9; l++) {
								for(int m = k+1; m < N; m++) {
									if(Integer.parseInt(A[m]) == l) {
										B[10 * j + l] = 1;
											break;
									}
								}
							}
						}
					}
				}
			}
		}
		for(int i = 1; i <= 9; i++) {
			for(int j = 0; j < N; j++) {
				if(Integer.parseInt(A[j]) == i){
					for(int k = 0; k <= 9; k++) {
						for(int l = j+1; l < N; l++) {
							if(Integer.parseInt(A[l]) == k) {
								for(int m = 0; m <= 9; m++) {
									for(int n = l+1; n < N; n++) {
										if(Integer.parseInt(A[n]) == m) {
											B[100 * i + 10 * k + m] = 1;
											break;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for(int i = 0; i < 1000; i++) {
			if(B[i] == 1) {
				count++;
			}
		}
		System.out.println(count);
	}

}