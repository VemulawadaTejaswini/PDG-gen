import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * http://code-festival-2017-qualb.contest.atcoder.jp/tasks/code_festival_2017_qualb_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<Integer,Integer> d = new HashMap<Integer,Integer>();
		
		final int N = sc.nextInt();
		for(int i=0; i<N; i++){
			int j = sc.nextInt();
			int num = d.containsKey(j) ? d.get(j) : 0;
			d.put(j, num+1);
		}
		final int M = sc.nextInt();
		int[] t = new int[M];
		for(int i=0; i<M; i++) t[i] = sc.nextInt();
		sc.close();
		
		boolean ans = true;
		for(int i=0; i<M; i++){
			if(!d.containsKey(t[i]) || d.get(t[i])==0){
				ans=false;
				break;
			}else{
				d.put(t[i], d.get(t[i])-1);
			}
		}
		
		System.out.println(ans ? "YES" : "NO");

	}

}
