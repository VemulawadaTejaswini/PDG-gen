import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Long[] p = new Long[a];
		for(int i = 0; i < a; i++){
		    p[i] = sc.nextLong();
		}
		Long[] q = new Long[b];
		for(int i = 0; i < b; i++){
		    q[i] = sc.nextLong();
		}
		Long[] r = new Long[c];
		for(int i = 0; i < c; i++){
		    r[i] = sc.nextLong();
		}
		
		Arrays.sort(p, Comparator.reverseOrder());
		Arrays.sort(q, Comparator.reverseOrder());
		Arrays.sort(r, Comparator.reverseOrder());
		
		// 計算
		long result = 0;
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		for(int i = 0; i < x; i++){
		    result += p[i];
		    pq.add(p[i]);
		}
		for(int i = 0; i < y; i++){
		    result += q[i];
		    pq.add(q[i]);
		}
		//int pcnt = x-1;
		//int qcnt = y-1;
		for(int i = 0; i < c; i++){
		    long now = pq.poll();
		    if(now <= r[i]){
		        result -= now;
		        result += r[i];
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

