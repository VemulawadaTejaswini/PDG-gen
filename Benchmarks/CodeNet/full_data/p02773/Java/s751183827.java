import java.util.*;
 
 
 
public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		 Map<String, Integer> map = new HashMap<String, Integer>();
		 while(N > 0) {
			 String str = sc.next();
			if(Map.containsKey(str)) {
				Map.put(str,(Map.get(str)));
			}
			else {
                Map.put(str,1);
            }
			 if (Map.get(str) > max) {
	                max = Map.get(str);
	            }
			N--;
		 }
	        List<String> result = new ArrayList<>();
	        for (String str: Map.keySet()){
	            if(Map.get(str) == max){
	                result.add(str);
	            }
	        }
	        Collections.sort(result);
	        for(String s : result) {
	        	System.out.println(s);
	        }
	}
}