import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) list.add(sc.nextInt());
		sc.close();
		Map<Integer,Integer> map = new HashMap<>();
		for(int tmp : list) {
			if(map.containsKey(tmp)) map.put(tmp,map.get(tmp)+1);
			else map.put(tmp, 1);
		}
		Map<Integer,Long> map2 = new HashMap<>();
		Map<Integer,Long> map3 = new HashMap<>();
		long sum = 0;
		for(int key : map.keySet()) {
			int tmp = map.get(key);
			if(tmp>=2) {
				map2.put(key, CalcUtil.nC2(tmp));
				sum += CalcUtil.nC2(tmp);
			}else {
				map2.put(key, 0L);
			}
			if(tmp>=3) {
				map3.put(key, CalcUtil.nC2(tmp-1));
			}else {
				map3.put(key, 0L);
			}
		}
		for(int tmp : list) {
			System.out.println(sum - map2.get(tmp) + map3.get(tmp));
		}
	}
	
	static class CalcUtil {
		public static long nC2(int n) {
			return (long)n * (long)(n-1) / 2;
		}
	}
}
