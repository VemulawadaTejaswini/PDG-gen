import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.next());
    	int k = Integer.parseInt(sc.next());
    	int s = Integer.parseInt(sc.next());
    	for(int i=0; i<k; i++) {
    	    System.out.println(s+" ");
    	}
    	for(int i=k; i<n; i++) {
    	    if(i < n-1) System.out.println(s+1+" ");
    	    else System.out.println(s+1);
    	}
    }
}