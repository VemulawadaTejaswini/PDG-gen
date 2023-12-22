import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int count = 0;
		int count2 = 0;

		Scanner sc = new Scanner(System.in);

		final int N = sc.nextInt();

		int[] H = new int[N];

		for(int i = 0;i < N;i++) {
		H[i] = sc.nextInt();
		}

		for(int j = 0; j < N-1; j++) {
			for(int k = j; k < N-1; k++) {
				if(H[k] >= H[k+1]) {
					count++;
				}else break;
			}
			if(count2 < count) {
				count2 = count;
			}
			count = 0;
		}

		System.out.println(count2);
	}
}