import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] cnt = new int[N];
		for(int i=0; i<M; i++) {
			cnt[sc.nextInt()-1]++;
			cnt[sc.nextInt()-1]++;
		}
		
		Arrays.sort(cnt);
		
		if(N<3)
			System.out.println("No");
		if(cnt[N-1]>=6 || cnt[N-2]>=4)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		sc.close();
	}
}
