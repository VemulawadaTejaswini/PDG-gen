import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int areas = sc.nextInt();
		int citys = sc.nextInt();
		List<Integer> area= new ArrayList<Integer>();
		List<Integer> cityTimes= new ArrayList<Integer>();
		Map<Integer,List<Integer>> map = new HashMap<>();
		int temp=0;
		Integer key = 0;
		List<Integer> listTemp =null;
		for (int i = 0; i < citys; i++) {
			area.add(sc.nextInt());
			cityTimes.add(sc.nextInt());
			key = area.get(i);
			if(!map.containsKey(key)){
				listTemp = new ArrayList<Integer>();
				listTemp.add(cityTimes.get(i));
				map.put(key, listTemp);
			}else{
				map.get(key).add(cityTimes.get(i));
			}
		}
		for (Entry<Integer, List<Integer>> vo : map.entrySet()) {
			Collections.sort(vo.getValue());
		}
		for (int i = 0; i < area.size(); i++) {
			temp = 0;
			key = area.get(i);
			temp = map.get(key).indexOf(cityTimes.get(i))+1;
			System.out.println(String.format("%06d", key)+String.format("%06d", temp));
		}
		sc.close();
	}
}
