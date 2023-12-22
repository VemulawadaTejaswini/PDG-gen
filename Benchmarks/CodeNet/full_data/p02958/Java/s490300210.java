import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N];
		for(int i=0; i<N; i++)
			p[i] = sc.nextInt();
		
		int cnt = 0;
		for(int i=0; i<N; i++) {
			if(p[i]!=i+1) {
				cnt++;
			}
		}
		System.out.println(cnt==0 || cnt==2 ? "YES" : "NO");
		sc.close();
	}
}
