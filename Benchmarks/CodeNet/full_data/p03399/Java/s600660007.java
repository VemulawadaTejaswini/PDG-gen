    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		
    		int a=Integer.parseInt(scan.next());
    		int b=Integer.parseInt(scan.next());
    		int c=Integer.parseInt(scan.next());
    		int d=Integer.parseInt(scan.next());
    		
    		int ans=(a>=b?b:a) +(c>=d?d:c);
    		System.out.print(ans);
    		

;
    		
     
    }
    }
// end 
    