import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int num = 0;
		int total = 0;
		int count = 0;
		int[] number = new int[N];
		for(int i = 0;i < N;i++) {
			int A = sc.nextInt();
			number[i] += A;
			num += A;
			if(i == N-1) {
				total = num / 4 * M;
				for(int j = 0;j < N;j++) {
					if(number[j] > total) {
						count++;
					}
				}
			}
		}
		if(count >= M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
  }
}