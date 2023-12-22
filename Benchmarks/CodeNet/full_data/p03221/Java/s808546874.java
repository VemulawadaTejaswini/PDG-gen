import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int areas = sc.nextInt();
		int citys = sc.nextInt();
		List<Integer> area= new ArrayList<Integer>();
		List<Integer> cityTimes= new ArrayList<Integer>();
		Map<Integer,TreeSet<Integer>> map = new HashMap<>();
		int temp=0;
		Integer key = 0;
		TreeSet<Integer> set =null;
		for (int i = 0; i < citys; i++) {
			area.add(sc.nextInt());
			cityTimes.add(sc.nextInt());
			key = area.get(i);
			if(!map.containsKey(key)){
				set = new TreeSet<Integer>();
				set.add(cityTimes.get(i));
				map.put(key, set);
			}else{
				map.get(key).add(cityTimes.get(i));
			}
		}
		for (int i = 0; i < area.size(); i++) {
			key = area.get(i);
			temp = new ArrayList(map.get(key)).indexOf(cityTimes.get(i))+1;
			System.out.println(String.format("%06d", key)+String.format("%06d", temp));
		}
		sc.close();
	}
}
