import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] ans = new int [N];
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < M; i++) {
			int keta = sc.nextInt();
			int num = sc.nextInt();
			//　同じ桁に違う数がある場合
			if(map.containsKey(keta)) {
				if(map.get(keta) != num) {
					System.out.print(-1);
					return;
				}
			}else {
				map.put(keta, num);
			}
		}

		//　最大桁数がない場合は1を補完
		if(!map.containsKey(1)) {
			map.put(1, 1);
		}

		//　最大桁数が0の場合
		if(N != 1) {
			if(map.get(1) == 0) {
				System.out.print(-1);
				return;
			}
		}
		
		//　最少値を取得
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			ans[entry.getKey() - 1] = entry.getValue();
		}

		for(int i = 0; i < N; i++) {
			System.out.print(ans[i]);
		}
		sc.close();
	}
	
}