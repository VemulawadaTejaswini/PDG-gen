import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		List<Integer> list = new ArrayList();
		Map<Integer,Integer> map = new HashMap();
		Map<Integer,Integer> map2 = new HashMap();
		Map<Integer,Integer> map3 = new HashMap();
		for(int i=0;i<N;i++){
			int a = Integer.parseInt(sc.next());
			if(map.containsKey(a)){
				map.put(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			}
			list.add(a);
		}
		for(Entry<Integer, Integer> a:map.entrySet()){
			map2.put(a.getKey(), keisan(a.getValue()));
			map3.put(a.getKey(), keisan(a.getValue()-1));
		}
		int total = 0;
		for(Integer a: map2.values()){
			total += a;
		}
//		System.out.println(map);
//		System.out.println(map2);
//		System.out.println(map3);
		for(Integer a:list){
			System.out.println(total-map2.get(a)+map3.get(a));
		}
	}
	public static int keisan(int a){
		int aa = 1;
		for(int i=a ; i>a-2 ; i--){
			aa *= i;
		}
		return aa/2;
	}
}
