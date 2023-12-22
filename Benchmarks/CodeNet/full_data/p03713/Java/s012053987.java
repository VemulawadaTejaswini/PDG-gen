import java.util.Scanner;

/**
 * https://abc062.contest.atcoder.jp/tasks/arc074_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		sc.close();
		
		long ans = Math.min((H%3)*W,(W%3)*H);
		ans = Math.min(ans, getAreaDiff(W,H));
		ans = Math.min(ans, getAreaDiff(H,W));
		
		System.out.println(ans);
		
	}
	
	static long getAreaDiff(long w, long h){
		long diff = h*w;
		for(int i=1; i<h; i++){
			long h1 = i;
			long h2 = h-i;
			long w1 = w/2;
			long w2 = w-w1;
			long area = (long) Math.max(h1*w, h2*w2) - Math.min(h1*w, h2*w1);
			diff = Math.min(diff, area);
		}
		return diff;
	}

}