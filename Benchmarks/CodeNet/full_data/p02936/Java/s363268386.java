import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int q = sc.nextInt();
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

		for(int i = 0; i < n - 1; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(map.containsKey(a)){
				ArrayList<Integer> list = map.get(a);
				list.add(b);
				map.put(a, list);
			}else{
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(b);
				map.put(a, list);
			}
		}

		int[] result = new int[n];

		for(int i = 0; i < q; i++){
			int p = sc.nextInt();
			int x = sc.nextInt();

            result[p - 1] = result[p - 1] + x;
		}
		
		for(int i = 0; i < n; i++){
            if(map.containsKey(i + 1)){
			    for(Integer v : map.get(i + 1)){
				    result[v - 1] = result[v - 1] + result[i];
			    }                
            }
		}

		// 出力
		for(int i = 0; i < n; i++){
			System.out.print(result[i] + " ");
		}
	}
}
