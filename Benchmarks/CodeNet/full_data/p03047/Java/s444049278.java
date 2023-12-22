import java.util.Arrays;
import java.util.Scanner;

public class Main{
		
	public static void main(String args[]){
		  
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int K = sc.nextInt();
	    
	    int ans = 0; 
	    int n[] = new int[51];
	    Arrays.fill(n,0);
	    for(int i = 1; i <= N; i++) {
	    	n[i] = i;
	    }
	    
	    for(int i = 1; i <= N; i++) {
	    	if(n[i+K-1] != 0) {
	    		ans++;
	    	}
	    }   
	    
	    System.out.println(ans);   
	}
}