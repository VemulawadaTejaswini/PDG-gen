import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];
		for(int i=0; i<N; i++)
			d[i] = sc.nextInt();
		
		long ans = 0;
		for(int i=0; i<N; i++)
			for(int j=i+1; j<N; j++)
				ans += d[i]*d[j];
		
		System.out.println(ans);

		sc.close();
	}
}
