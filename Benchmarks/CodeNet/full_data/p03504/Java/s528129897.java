import java.util.*;
//080D
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), C = sc.nextInt();
		int sec = (int)1e5;
		Long overlap[] = new Long[sec + 1];
		Arrays.fill(overlap,0L);
		for(int i=0;i<N;i++) {
			int s = sc.nextInt(), t = sc.nextInt(), c = sc.nextInt();
			for(int j=s-1;j<=t-1;j++) {
				overlap[j]++;
			}
		}	
		Arrays.sort(overlap,Comparator.reverseOrder());
		long ans = overlap[0];
		System.out.println(ans);
	}
}
