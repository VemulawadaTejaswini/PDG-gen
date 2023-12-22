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
		Map<String,TreeSet<Integer>> map = new HashMap<>();
		int temp=0;
		String key = "";
		String str="";
		List<String> areasList = new ArrayList<String>();
		TreeSet<Integer> set =null;
		for (int i = 0; i < citys; i++) {
			area.add(sc.nextInt());
			cityTimes.add(sc.nextInt());
			str = ""+area.get(i);
			switch(str.length()){
			case 1:
				areasList.add("00000"+str);
				break;
			case 2:
				areasList.add("0000"+str);
				break;
			case 3:
				areasList.add("000"+str);
				break;
			case 4:
				areasList.add("00"+str);
				break;
			case 5:
				areasList.add("0"+str);
				break;
			case 6:
				areasList.add(""+str);
				break;
			}
			key = areasList.get(i);
			if(!map.containsKey(key)){
				set = new TreeSet<Integer>();
				set.add(cityTimes.get(i));
				map.put(key, set);
			}else{
				map.get(key).add(cityTimes.get(i));
			}
		}
		for (int i = 0; i < area.size(); i++) {
			key = areasList.get(i);
			temp = new ArrayList(map.get(key)).indexOf(cityTimes.get(i))+1;
			System.out.println(key+String.format("%06d", temp));
		}
		sc.close();
	}
}
