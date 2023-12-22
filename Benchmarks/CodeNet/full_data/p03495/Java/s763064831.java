import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++){
			int x = sc.nextInt();
			map.put(x, map.containsKey(x) ? map.get(x)+1 : 1);
		}
		int num = map.size() - k;
		int sum = 0;
		for(Entry<Integer, Integer> e : map.entrySet().stream().sorted((e1, e2) -> e1.getValue() - e2.getValue()).collect(Collectors.toList())){
			if(num-- <=0) break;
			sum += e.getValue();
		}
		System.out.println(sum);
	}
}
