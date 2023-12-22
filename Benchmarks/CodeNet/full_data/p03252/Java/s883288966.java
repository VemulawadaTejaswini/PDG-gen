import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		HashMap<String, Integer>sMap = new HashMap<String, Integer>();
		HashMap<String, Integer>tMap = new HashMap<String, Integer>();

		for (int i=0; i<s.length(); i++){
			String sSub = s.substring(i, i+1);
			if (sMap.containsKey(sSub)){
				sMap.put(sSub, sMap.get(sSub) + 1);
			} else {
				sMap.put(sSub, 1);
			}
			String tSub = t.substring(i, i+1);
			if (tMap.containsKey(tSub)){
				tMap.put(tSub, tMap.get(tSub) + 1);
			} else {
				tMap.put(tSub, 1);
			}
		}
		int sCount[] = new int[sMap.size()];
		int tCount[] = new int[tMap.size()];
		java.util.Iterator<String> it = sMap.keySet().iterator();
		int j = 0;
		while (it.hasNext()){
			String key = it.next();
			sCount[j] = sMap.get(key);
			j++;
		}
		it = tMap.keySet().iterator();
		j = 0;
		while (it.hasNext()){
			String key = it.next();
			tCount[j] = tMap.get(key);
			j++;
		}
		Arrays.sort(sCount);
		Arrays.sort(tCount);
		if (Arrays.equals(sCount, tCount)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}