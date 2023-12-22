import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String args[]) {
		
		String bufferStr = "str";
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		String input2 = sc.nextLine();
		String[] temp2 =  input2.split(" ");
		
		int sushiType = Integer.parseInt(temp2[0]);
		int howMany = Integer.parseInt(temp2[1]);
		String[] input = new String[sushiType];
		for(int i=0;i<sushiType;i++) {
			input[i] = sc.nextLine();
			String[] temp =  input[i].split(" ");
			int sushiTypeNumber = Integer.parseInt(temp[0]);
			int deliciousNess = Integer.parseInt(temp[1]);
			hashMap.put(sushiTypeNumber+"_"+bufferStr+i, deliciousNess);
		}
		
		Map<String, Integer> sortedHashMap = sortByValue(hashMap);
		Set<Integer> uniqueSushiType = new HashSet<Integer>();
		
		int i = 1;
		int deliciousnessTotal = 0;
		for (String keys : sortedHashMap.keySet())
		{
		   deliciousnessTotal += sortedHashMap.get(keys);
		   uniqueSushiType.add(Integer.parseInt(keys.charAt(0)+""));
		   if(i==howMany)
			   break;
		   i++;
		}
		
		System.out.print(deliciousnessTotal + (uniqueSushiType.size()*uniqueSushiType.size()));
	}
	
	 public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
	        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
	        list.sort(Entry.comparingByValue());
	        Collections.reverse(list);

	        Map<K, V> result = new LinkedHashMap<>();
	        for (Entry<K, V> entry : list) {
	            result.put(entry.getKey(), entry.getValue());
	        }

	        return result;
	    }

}