import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
	    for(int i = 0; i < n; i++){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        if(map.containsKey(a)){
	            map.get(a).add(b);
	        }else{
	            ArrayList<Integer> list = new ArrayList<Integer>();
	            list.add(b);
	            map.put(a, list);
	        }
		}
		
		// 計算
		int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());		
        for(int i = 1; i < m + 1; i++){
            if(map.containsKey(i)){
                for(int j : map.get(i)){
                    pq.add(j);
                }
            }
            if(pq.size()>0) sum = sum + pq.poll();
        }

		// 出力
        System.out.println(sum);
		
	}
}
