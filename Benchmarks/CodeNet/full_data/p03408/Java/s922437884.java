
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
        	String s = sc.next();
        	if (map.containsKey(s)) {
        		map.put(s, map.get(s)+1);
        	} else {
        		map.put(s, 1);
        	}
        }
        
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
        	String t = sc.next();
        	if (map.containsKey(t)) {
        		map.put(t, map.get(t)-1);
        	} else {
        		map.put(t, -1);
        	}
        }
        
        int maxCount = 0;
        for (Entry<String,Integer> e: map.entrySet()) {
        	if (maxCount < e.getValue()) {
        		maxCount = e.getValue();
        	}
        }
        
        System.out.println(maxCount);
    }
}


