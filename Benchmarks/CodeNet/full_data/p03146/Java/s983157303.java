import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt();
        
        Map<Integer,Boolean> map = new HashMap<>(1000_000);
        map.put(s, true);
        for (int i = 2; i <= 1000000; i++) {
        	s = f(s);
        	if (map.containsKey(s)) {
        		System.out.println(i);
        		break;
        	} else {
        		map.put(s, true);
        	}
        }
    }
    
    static int f(int s) {
    	if (s % 2 == 0) {
    		return s /2;
    	} else {
    		return 3*s+1;
    	}
    }
}