import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String line;
        
        int n = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> d = new ArrayList<Integer>();
        
        for(int i = 0; cin.hasNext(); i++){
	        line = cin.nextLine();
	        
	        if(i == 0) {
	            n = Integer.parseInt(line);
	            
	        } else if(i == 1) {
	            String[] _a = line.split(" ", 0);
	            
	            for(int j = 0; j < n; j++) {
	                a.add(Integer.parseInt(_a[j]));
	                
	            }
	            
	        } else if(i == 2) {
	            String[] _b = line.split(" ", 0);
	            
	            for(int j = 0; j < n; j++) {
	                b.add(Integer.parseInt(_b[j]));
	                
	            }
	            
	        } else {
	            
	        }
	        
        }
        
        for(int i = 0; i < n; i++) {
            d.add(a.get(i) - b.get(i));
            
        }
        
        Collections.sort(d);
        
        if(d.get(0) >= 0) {
            System.out.println(0);
            return;
            
        }
        
        int sumA = 0;
        int sumB = 0;
        
        for(int i = 0; i < n; i++) {
            sumA += a.get(i);
            sumB += b.get(i);
            
        }
        
        if(sumA < sumB) {
            System.out.println(-1);
            return;
            
        }
        
        int i = 0;
        int _d = 0;
        
        for(; d.get(i) < 0; i++) {
            _d += d.get(i);
            
        }
        
        int j = d.size() - 1;
        
        for(; _d < 0; j--) {
            _d = _d + d.get(j);
            
        }
        
        System.out.println(i + d.size() - j - 1);
        
    }
    
}
