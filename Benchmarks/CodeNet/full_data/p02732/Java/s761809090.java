import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<Long, Long> map = new HashMap<Long, Long>();
		List<Long> list = new ArrayList<Long>();
		for(int i = 0; i < n; i++){
			long tmp = scanner.nextInt();
			list.add(tmp);
			if(map.containsKey(tmp)){
				map.put(tmp, map.get(tmp) + 1);
			}else{
				map.put(tmp, 1l);
			}
		}
//		for(int j : map.keySet()){
//			System.out.println(j + " : " +map.get(j));
//		}
		Map<Long, Long> resultMap = new HashMap<Long, Long>();
		long result = 0l;
		for(long k : list){
			result = 0l;
			if(resultMap.containsKey(k)){
				System.out.println(resultMap.get(k));
			}else{
				for(long j : map.keySet()){
					if(j == k){
						result += comb(map.get(j)-1);
					}else{
						result += comb(map.get(j));
					}
				}
				System.out.println(result);
				resultMap.put(k, result);
			}

		}
	}

	private static long comb(long input){
		return input*(input-1)/2;
	}

}
