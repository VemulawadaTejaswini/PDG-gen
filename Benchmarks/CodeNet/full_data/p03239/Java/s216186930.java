import java.util.*;

public class Main {
    
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] c = new int[N];
		int[] t = new int[N];
		int min = Integer.MAX_VALUE;
		int count = -1;
		
		for(int i = 0;i < N ; i++) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N ; i++){
		    if(min > c[i] && T >= t[i]){
		    min = Math.min(min,c[i]);
		    count = i;
			}
	    }
	
		if(count == -1){ System.out.println("TLE");}
		else{System.out.println(c[count]);}
    }
}