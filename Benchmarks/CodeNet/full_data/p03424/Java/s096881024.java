import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		boolean ans = false; 
	    for(int i = 0; i<n; i++) {
	    	char c = sc.next().charAt(0);
	    	if(c == 'Y') ans = true; 
	    }
	    if(ans) System.out.println("Four");
	    else System.out.println("Three"); 
	}
}