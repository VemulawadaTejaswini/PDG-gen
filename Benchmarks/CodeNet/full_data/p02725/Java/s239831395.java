import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int[] num = new int[N];
		int count = 0;
		for(int i = 0;i < N;i++) {
			int A = sc.nextInt();
			num[i] += A;
			if(i == N-1) {
				Arrays.sort(num);
				if(num[0] != 0) {
					count = num[N-1] - num[0];
				}else {
					count = num[N-1] - num[1];
				}
			}
		}
		System.out.println(count);
	}
}