import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] str = new int[N];
		long total = 0;
		long ans = Long.MAX_VALUE;
		long temp = 0;

		for( int i = 0; i < N; i++){
			str[i] = scan.nextInt();
			total = total + str[i];
		}
		for(int i = 0; i < N; i++){
			temp = temp + str[i];
			if(i+1<N){
				ans = Math.min(ans, Math.abs(total-temp*2));
			}
		}
		System.out.println(ans);

	}
}