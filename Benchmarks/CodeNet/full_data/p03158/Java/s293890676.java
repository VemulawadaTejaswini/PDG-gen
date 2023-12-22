import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String line;
        
        int n = 0;
        int q = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> x = new ArrayList<Integer>();
        
        for(int i = 0; cin.hasNext(); i++){
	        line = cin.nextLine();
	        
	        if(i == 0) {
	            String[] nq = line.split(" ", 0);
	            
	            n = Integer.parseInt(nq[0]);
	            q = Integer.parseInt(nq[1]);
	            
	        } else if(i == 1) {
	            String[] _a = line.split(" ", 0);
	            
	            for(int j = 0; j < _a.length; j++) {
	                a.add(Integer.parseInt(_a[j]));
	                
	            }
	            
	        } else {
	            x.add(Integer.parseInt(line));
	            
	        }
	        
        }
        
        for(int i = 0; i < q; i++) {
            int res = 0;
            ArrayList<Integer> _a = (ArrayList<Integer>) a.clone();
            
            while(_a.size() > 0) {
                int tCard = _a.remove(_a.size() - 1);
                
                res += tCard;
                
                if(_a.size() == 0) {
                    break;
                    
                }
                
                int d = Math.abs(x.get(i) - _a.get(0));
                int j = 1;
                
                for(; j < _a.size(); j++) {
                    int tmp = Math.abs(x.get(i) - _a.get(j));
                    
                    if(tmp < d) {
                        d = tmp;
                        
                    } else {
                        break;
                    
                    }
                    
                }
                
                _a.remove(j - 1);
            
            }
            
            System.out.println(res);
        
        }
        
    }
    
}
