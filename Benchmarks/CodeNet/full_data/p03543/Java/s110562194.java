    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan=new Scanner(System.in);
    		
    		char[] n=scan.next().toCharArray();
    		int ans =0;
    		
    		for(int i=0;i<2;++i) {
    			for (int j=i+1;j<4;++j) {
    				if (n[i]==n[j]) {
    					++ans;
    				}
    			}
    			if (ans>=2) {
    				break;
    			}else {
    				ans=0;
    			}
    		}
    		System.out.print(ans>=2?"Yes":"No") ;   	
  
    				
 
     
    }
    }
// end 