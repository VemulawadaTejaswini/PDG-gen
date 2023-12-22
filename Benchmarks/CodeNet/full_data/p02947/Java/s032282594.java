import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		List<Map<String, Integer>> mapList = new ArrayList<>();


		for (int i = 0; i < n; i++) {
			Map<String, Integer> map =  new HashMap<>();
			String str = sc.next();
			String[] strArray = str.split("");
			Arrays.sort(strArray);

			String s = "";
			for(int j = 0;j<10;j++){
				String ss = strArray[j];
				s += ss;
				// if(map.containsKey(ss)){
				// 	int current = map.get(ss);
				// 	map.put(ss, current+1);
				// }else{
				// 	map.put(ss, 1);
				// }
			}
			// System.out.println("map " +  map);
			list.add(str);
			// mapList.add(map);
			slist.add(s);
		}

		long count = 0;

		for (int i = 0; i < n; i++) {
			// Map<String, Integer> imap =  mapList.get(i);
			// System.out.println("imap " +  imap);
			String is = slist.get(i);

			for(int j = i+1; j < n; j++){
				// Map<String, Integer> jmap =  mapList.get(j);
				// System.out.println("jmap " +  jmap);

				boolean isSame =true;
				// for(Map.Entry<String, Integer> entry : jmap.entrySet()) {
				// 	if(imap.get(entry.getKey()) != entry.getValue()){
				// 		isSame =false;
				// 		break;
				// 	}
				// }
				String js = slist.get(j);
				if(is.equals(js)){
					count++;
				}
			}
		}

		System.out.print(count);
			
	}

}
