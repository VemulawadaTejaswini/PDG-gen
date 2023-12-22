import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Long> map = new HashMap<>();
        long count = 0L;
        for (int i = 0; i < N; i++) {
        	String s = sc.next();
        	char[] ar = s.toCharArray();
        	Arrays.sort(ar);
        	String key = new String(ar);
        	if (map.containsKey(key)) {
        		count += map.get(key);
        		map.put(key, map.get(key) + 1);
        	} else {
        		map.put(key, 1L);
        	}
        }
        System.out.println(count);
    }
}