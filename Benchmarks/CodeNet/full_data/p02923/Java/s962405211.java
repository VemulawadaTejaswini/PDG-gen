import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] H = new int[N];

		for (int i=0; i<N; i++){
			H[i] = sc.nextInt();
		}
		int ans = 0;
		for (int i=0; i<N-1; i++){
			if (H[i] >= H[i+1]){
				ans++;
			} else {
				ans = 0;
			}
		}
		System.out.println(ans);
	}

}