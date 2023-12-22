import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;++i)
			A[i] = sc.nextInt();
		sc.close();
		
		for(int i = 0;i < N;++i)
			A[i] = A[i] - i;
		
		int avg = 0;
		for(int i = 0;i < N;++i)
			avg += A[i];
		avg = avg / N;
		if(avg < 0)avg--;
		
		int ans = 0;
		for(int i = 0;i < N;++i)
			ans += Math.abs(A[i] - avg);
		System.out.println(ans);
	}
}