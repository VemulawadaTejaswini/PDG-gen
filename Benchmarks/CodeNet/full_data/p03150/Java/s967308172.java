import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String line;
        
        String keyence = "keyence";
        String s = "";
        
        ArrayList<Integer> n = new ArrayList<Integer>();
        
        for(int i = 0; cin.hasNext(); i++){
	        line = cin.nextLine();
	        
	        if(i == 0) {
	            s = line;
	            
	        } else {
	            
	        }
	        
        }
        
        int dcnt = 0;
        int j = 0;
        String _s = "";
        
        for(int i = 0; i < 7 && j < s.length(); i++) {
            if(s.substring(j, j + 1).equals(keyence.substring(i, i + 1))) {
                _s += s.substring(j, j + 1);
                
            } else {
                dcnt++;
                
                while(j < s.length()) {
                    if(s.substring(j, j + 1).equals(keyence.substring(i, i + 1))) {
                        _s += s.substring(j, j + 1);
                        break;
                        
                    } else {
                        
                    }
                    
                    j++;
                    
                }
                
            }
            
            j++;
            
        }
        
        String res = "NO";
        
        if(dcnt == 0 && _s.equals(keyence) || dcnt == 1 && _s.equals(keyence)) {
            res = "YES";
            
        }
        
        System.out.println(res);
        
    }
    
}
