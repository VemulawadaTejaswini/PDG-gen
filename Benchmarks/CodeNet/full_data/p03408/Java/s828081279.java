import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
      	HashMap<String, Integer> nam = new HashMap<String, Integer>();
      
      int memo = 0;
      for(int i = 0;i < a;i++){
        String ss = in.next();
        
        if(nam.get(ss) == null){
          nam.put(ss,1);
        }else{
          memo = nam.get(ss);
          nam.put(ss,memo+1);
        }
     }
      
      memo = 0;int b = in.nextInt();
      for(int i = 0;i < b;i++){
        String ss = in.next();
        
        if(nam.get(ss) == null){
          nam.put(ss,-1);
        }else{
          memo = nam.get(ss);
          nam.put(ss,memo-1);
        }
     }
      int max = 0;int min = 0;String M = "aa";
    for(Map.Entry<String, Integer> entry : nam.entrySet()) {
            String ss = entry.getKey();
            max = entry.getValue();
      	if(max >= min){
        	M = ss;
          	min = max;
        }
        }
      
      System.out.println(min);
      
      
      
	}
}
