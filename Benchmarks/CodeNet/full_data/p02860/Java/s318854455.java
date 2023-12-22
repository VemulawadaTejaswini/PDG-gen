import java.util.*;

public class Main {
    public static void main(String[] args)   {
        
    	Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int n=sc.nextInt();
        
	    String s_half = s.substring(0, n/2);
	    String s_half2 = s.substring(n/2, n);
	   
	    if(s_half.equals(s_half2)) {
	    			System.out.println("Yes");
    		}else {
    			System.out.println("No");
    		}
    	}
    }