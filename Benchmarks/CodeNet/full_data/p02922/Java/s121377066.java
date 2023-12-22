import java.util.*;

class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int a = Integer.parseInt(sc.next());
	    int b = Integer.parseInt(sc.next());
	    
	    int counter = 1;
	    boolean flag = true;
	    
	    while(flag) {
	        if(a * counter >= b) {
	            flag = false;
	        }
	        else ++counter;
	    }
	    System.out.println(counter);
	  
	}
}