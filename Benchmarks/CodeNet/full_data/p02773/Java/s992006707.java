import java.util.Scanner;
import java.util.*;
class Main{ //start class
	public static void main(String[] args) { // start main
			Scanner scan = new Scanner(System.in);
			Map<String, Integer> cntMap = new HashMap<>();
			while(scan.hasNext()) { // start while
				String str = scan.next();
				if(!cntMap.containsKey(str)) {
					cntMap.put(str, 1);
				} else {
					int cnt = cntMap.get(str);
					cntMap.put(str, ++cnt);
				}
			} //end while
			
			List<String> list = new ArrayList<>();
			int max = 0;
      		for(Map.Entry<String, Integer> entry : cntMap.entrySet()) {
            	if(max < entry.getValue()) {
                  max = entry.getValue();
                }
            }
			for(Map.Entry<String, Integer> entry : cntMap.entrySet()) {
				if(max == entry.getValue()) {
					list.add(entry.getKey());
				}
			}
			Collections.sort(list);
			
			for(String s : list) {
				System.out.println(s);
			}
	} // end main
} // end class