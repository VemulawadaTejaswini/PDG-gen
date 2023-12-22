import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		int count = 0;
		for(int i = 0;i < N;i++) {
			int A = sc.nextInt();
			num[i] += A;
			if(i == N-1) {
				for(int k = N-1;k >= 0;k--) {
					for(int j = 0;j < N;j++) {
						if(j != k) {
							if(num[k] == num[j]) {
								count++;
							}
						}
					}
				}
			}
		}
		if(count > 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}