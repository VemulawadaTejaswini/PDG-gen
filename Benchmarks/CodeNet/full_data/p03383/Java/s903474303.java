import java.util.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        String s;
        Map<Long, Integer> codec = new HashMap<Long, Integer>();
        Map<Long, Integer> coder = new HashMap<Long, Integer>();
        Long temp = (long)0;
        Long tmp = (long)0;
        Long[] row = new Long[w];
        int count = 0;

        for(int i=0; i<w; i++){
        	row[i] = (long)0;
        }
        
        for(int i=0; i<h; i++){
        	s = sc.next();
        	temp =  (long)0;
        	
        	for(int j=0; j<w; j++){
        		tmp = (long)Math.pow(10, ((int)s.charAt(j)) - 97);
        		temp += tmp;
        		row[j] += tmp;
        	}
        	
        	if(codec.get(temp) == null){
        		codec.put(temp, 1);
        	}else{
        		codec.put(temp, codec.get(temp) + 1);
        	}
        }
        
        for(int j=0; j<w; j++){
        	if(coder.get(row[j]) == null){
        		coder.put(row[j], 1);
        	}else{
        		coder.put(row[j], coder.get(row[j]) + 1);
        	}
        }
        
        count = 0;
        
        for (Integer val : codec.values()) {
			if(val%2 == 1){
				count++;
			}
		}
        
        if(count != h%2){
        	System.out.println("NO");
			sc.close();
			return;
        }
        
        count = 0;
        
        for (Integer val : coder.values()) {
			if(val%2 == 1){
				count++;
			}
		}
        
        if(count != w%2){
        	System.out.println("NO");
			sc.close();
			return;
        }

        System.out.println("YES");
        sc.close();
    }
}
	