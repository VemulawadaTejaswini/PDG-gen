import java.util.Scanner;

/**
 * ABC111A
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String[] chars = n.split("");
        
        int before = Integer.valueOf(chars[0]);
        int now = 0;
        
        boolean bad = false;
        
        for(int i=1;i<chars.length;i++) {
        	now = Integer.valueOf(chars[i]);
        	if(before==now) {
        		bad = true;
        	}
        	before = now;
        }
        
        if(bad) {
        	System.out.println("Bad");
    	}else {
    		System.out.println("Good");
    	}
        
        sc.close();
    }
}