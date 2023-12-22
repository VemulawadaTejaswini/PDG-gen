    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan=new Scanner(System.in);
    		
    		char[]s=scan.next().toCharArray();
    		
    		int ans=0;
    		for (char i:s) {
    			if ("1".contentEquals(String.valueOf(i))) {
    				++ans;
    			}
    		}
    		System.out.print(ans);
    				
 
     
    }
    }
// end 