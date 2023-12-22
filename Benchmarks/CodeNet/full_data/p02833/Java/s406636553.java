import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        
        sc.close();
        
        String l = String.valueOf(func(N));
        int ans = 0;
        
        for(int i = l.length() -1; i > 0; i--) {
        	
        	if ("0".equals(String.valueOf(l.charAt(i)))){
        		
        		ans++;
        	} else {
        		
        		break;
        	}
        }
        
        System.out.print(ans);
    }
    
    public static long func(long n) {
    	
    	long m = n-2;
    	long ans = n;
    	
    	while (m > 1) {
    		
    		ans = ans * m;
    		m = m -2;
    	}
    	
    	return ans;
    	
    }
}