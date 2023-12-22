import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int count=0;
		int[] p = new int[N];
		int[] q = new int[N];
		
		for(int i=0;i<N;i++) {
			int s=sc.nextInt();
			p[i]=s;
			q[i]=s;
		}
		Arrays.sort(q);
		
		for(int i=0;i<N;i++) {
			if(p[i]!=q[i]) {
				count++;
			}
		}
		
		if(count<3) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		
		sc.close();
	}
}
