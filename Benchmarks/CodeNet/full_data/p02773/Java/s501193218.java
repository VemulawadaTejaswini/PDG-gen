import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); 
		
		String[] s = new String[n];
		
		for(int i = 0; i < n; i++) {
			s[i] = stdIn.next();
		}
		
		
		Map<String,Integer> map = new TreeMap<>();
		
		
		
		
		for(int i = 0; i < n; i++) {
			if(!map.containsKey(s[i])) {
				map.put(s[i], 0);
			}
			map.put(s[i], map.get(s[i])+1);
			
		}
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			max = Math.max(max, map.get(s[i]));
		}
		
	
	
		
		
		for(String a: map.keySet()) {
			if(map.get(a)== max) {
				System.out.println(a);
			}
		}
		
		
	}

}
