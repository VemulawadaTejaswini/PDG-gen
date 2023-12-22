import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String[] A = new String[N];
		String[] B = new String[M];
		for(int i = 0;i < N;i ++) {
			A[i] = sc.next();
		}
		for(int i = 0;i < M;i ++) {
			B[i] = sc.next();
		}
		int cntchar = 0,find = 0;
		for(int i = 0;i < N - M;i ++) {
			for(int k = 0;k < M;k ++) {
				for(int j = 0;j < M;j ++) {
					char cA = A[k].charAt(j + i), cB = B[k].charAt(j);
					if(cA == cB) cntchar++;
				}
				if(cntchar == M)find = 1;
			}
		}
		if(find == 1)System.out.println("Yes");
		else System.out.println("No");
	}
}