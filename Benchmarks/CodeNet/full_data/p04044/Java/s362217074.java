import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		long max = 0;

		Map<Long, List<String>> maps = new HashMap<Long, List<String>>();
		for(int i = 0; i < N; i++) {
			String s = sc.next();
			long num = getNumFromString(s, L);
			if(maps.containsKey(num)) {
				maps.get(num).add(s);
			}else {
				List<String> stringList = new ArrayList<String>();
				stringList.add(s);
				maps.put(num, stringList);
			}
			max = Math.max(num, max);
		}
		sc.close();
		
		Set<Long> sortedKeys = new TreeSet<Long>(maps.keySet());
		StringBuilder sb = new StringBuilder();
		Iterator<Long> iter = sortedKeys.iterator();
		while(iter.hasNext()) {
			long num = iter.next();
		    List<String> strList = maps.get(num);
		    for(String s: strList) {
		    	sb.append(s);
		    }
		}
		System.out.println(sb.toString());
		
	}
	
	public static void bubbleSort(long[] arr) {  
//		new TreeSet<Long>();
        int n = arr.length;  
        long temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){    
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
}
	
	private static long getNumFromString(String s, int len) {
		long num = 0;
		for(int i = 0; i < len; i++) {
			num += ((int)s.charAt(i) - 96) * Math.pow(2, i);
		}
		return num;
	}
	

}
