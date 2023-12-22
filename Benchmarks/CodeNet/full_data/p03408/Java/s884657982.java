import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<String> listr = new ArrayList<String>();
		for(int i=0; i<n; i++ ) {
			listr.add(sc.next());
		}

		Map<String, Integer> mapr = new LinkedHashMap<String, Integer>();
		for (String s1 : listr) {
			int countb = 0;

			for (String s2 : listr) {
				if(s1.equals(s2)) countb++;
			}
			
			mapr.put(s1, countb);
//			System.out.println(countb);
		}

		int m = sc.nextInt();

		List<String> listb = new ArrayList<String>();
		for(int i=0; i<m; i++ ) {
			listb.add(sc.next());
		}

		Map<String, Integer> mapb = new LinkedHashMap<String, Integer>();
		for (String s1 : listb) {
			int countb = 0;

			for (String s2 : listb) {
				if(s1.equals(s2)) countb++;
			}
			
			mapb.put(s1, countb);
		}

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (String s1 : listr) {
			int r = mapr.get(s1);
			int b;
			if (mapb.containsKey(s1)) {
				b = mapb.get(s1);
			} else {
				b = 0;
			}
			arrayList.add(r-b);
		}

		int result = (Collections.max(arrayList)<0)? 0 : Collections.max(arrayList);
		// 出力
		System.out.println(result);
	}
}