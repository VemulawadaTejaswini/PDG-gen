import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
	    HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<Integer, PriorityQueue<Integer>>();
	    for(int i = 0; i < n; i++){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
            if(map.containsKey(a)){
                map.get(a).add(b);
            }else{
                PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
                pq.add(b);
                map.put(a, pq);
            }
		}
		
		// 計算
		int sum = 0;
        for(int i = 1; i < m + 1; i++){
            int max_i = 0;
            int max_val = 0;
            for(int j = 1; j < i + 1; j++){
                if(map.containsKey(j)){
                    if(max_val < map.get(j).peek()){
                        max_val = map.get(j).peek();
                        max_i = j;
                    }
                }
            }
            if(map.containsKey(max_i)) sum = sum + map.get(max_i).poll();
        }

		// 出力
        System.out.println(sum);
		
	}
}
