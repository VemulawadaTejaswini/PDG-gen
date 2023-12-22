import java.util.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        String s;
        Map<Integer, Integer> codec = new HashMap<Integer, Integer>();
        Map<Integer, Integer> coder = new HashMap<Integer, Integer>();
        Integer temp = 0, tmp;
        Integer[] row = new Integer[w];
        int flag = 0;

        for(int i=0; i<w; i++){
        	row[i] = 0;
        }
        
        for(int i=0; i<h; i++){
        	s = sc.next();
        	temp =  0;
        	
        	for(int j=0; j<w; j++){
        		tmp = (int)Math.pow(2, ((int)s.charAt(j)) - 97);
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
        
        for (Integer val : codec.values()) {
			if(h%2 == 1 && val%2 == 1 && flag == 0){
				flag = 1;
			}else if((flag == 1 && val%2 == 1) || (h%2 == 0 && val%2 == 1)){
				System.out.println("NO");
				sc.close();
				return;
			}
		}
        
        flag = 0;
        
        for (Integer val : coder.values()) {
			if(h%2 == 1 && val%2 == 1 && flag == 0){
				flag = 1;
			}else if((flag == 1 && val%2 == 1) || (h%2 == 0 && val%2 == 1)){
				System.out.println("NO");
				sc.close();
				return;
			}
		}

        System.out.println("YES");
        sc.close();
    }
}
	