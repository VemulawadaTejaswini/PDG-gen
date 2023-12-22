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
		for (int i = 0; i < citys; i++) {
			area.add(sc.nextInt());
			cityTimes.add(sc.nextInt());
		}
		List<String> areasList = new ArrayList<String>();
		String str = "";
		for (int i = 1; i <= area.size(); i++) {
			str = ""+area.get(i-1);
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
			
		}
		Map<String,List<Integer>> map = new HashMap<>(); 
		for (int i = 0; i < area.size(); i++) {
			if(!map.containsKey(areasList.get(i))){
				List<Integer> listTemp = new ArrayList<Integer>();
				listTemp.add(cityTimes.get(i));
				map.put(areasList.get(i).toString(), listTemp);
			}else{
				map.get(areasList.get(i).toString()).add(cityTimes.get(i));
			}
		}
		for (Entry<String, List<Integer>> vo : map.entrySet()) {
			Collections.sort(vo.getValue());
		}
		List<String> resultList = new ArrayList<String>();
		int temp=0;
		for (int i = 0; i < areasList.size(); i++) {
			temp = 0;
			for (Entry<String, List<Integer>> vo : map.entrySet()) {
				temp = vo.getValue().indexOf(cityTimes.get(i))+1;
				if(temp != 0){
					break;
				}
			}
			switch((""+temp).toString().length()){
			case 1:
				resultList.add(areasList.get(i).toString()+"00000"+temp);
				break;
			case 2:
				resultList.add(areasList.get(i).toString()+"0000"+temp);
				break;
			case 3:
				resultList.add(areasList.get(i).toString()+"000"+temp);
				break;
			case 4:
				resultList.add(areasList.get(i).toString()+"00"+temp);
				break;
			case 5:
				resultList.add(areasList.get(i).toString()+"0"+temp);
				break;
			case 6:
				resultList.add(areasList.get(i).toString()+""+temp);
				break;
			}
		}
		for (int i = 0; i <= resultList.size()-1 ; i++) {
			System.out.println(resultList.get(i));
		}
		sc.close();
	}
}
