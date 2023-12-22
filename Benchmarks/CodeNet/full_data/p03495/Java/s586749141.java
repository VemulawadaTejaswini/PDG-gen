import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), k = scanner.nextInt();
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++){
			String a = scanner.next();
			if(!map.containsKey(a)){
				map.put(a, 1);
			}else{
				map.put(a, map.get(a) + 1);
			}
		}
		int count = 0;
		int size = map.size();
		map = map.entrySet().stream()
				.sorted(Entry.<String,Integer>comparingByValue())
				.collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1, e2)->e1,LinkedHashMap::new));
		for(String key : map.keySet()){
			if(size <= k){
				break;
			}
			count += map.get(key);
			size--;
		}
		System.out.println(count);
	}

}
