    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		
    		int n=Integer.parseInt(scan.next());
    		int a=Integer.parseInt(scan.next());
    		
    		int _a=n-(n/500)*500;
    		
    		if (a>=_a) {
    			System.out.print("Yes");
    		}else {
    			System.out.print("No");
    		}
 
     
    }
    }
// end 