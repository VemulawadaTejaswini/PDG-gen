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
		List<String> areasList = new ArrayList<String>();
		Map<String,List<Integer>> map = new HashMap<>();
		String str = "";
		int temp=0;
		String key = "";
		List<Integer> listTemp =null;
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
				listTemp = new ArrayList<Integer>();
				listTemp.add(cityTimes.get(i));
				map.put(key, listTemp);
			}else{
				map.get(key).add(cityTimes.get(i));
			}
		}
		for (Entry<String, List<Integer>> vo : map.entrySet()) {
			Collections.sort(vo.getValue());
		}
		for (int i = 0; i < areasList.size(); i++) {
			temp = 0;
			key = areasList.get(i);
			temp = map.get(key).indexOf(cityTimes.get(i))+1;
			switch((""+temp).toString().length()){
			case 1:
				System.out.println(key+"00000"+temp);
				break;
			case 2:
				System.out.println(key+"0000"+temp);
				break;
			case 3:
				System.out.println(key+"000"+temp);
				break;
			case 4:
				System.out.println(key+"00"+temp);
				break;
			case 5:
				System.out.println(key+"0"+temp);
				break;
			case 6:
				System.out.println(key+""+temp);
				break;
			}
		}
		sc.close();
	}
}
