import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int H = sc.nextInt();		
		int W = sc.nextInt();
		long count = 0;
		
		for(int i=1; i<=H; i++){
			if(W%2!=0&&i%2!=0)
			count += W/2+1; 
			else
			count += W/2;
		}
		System.out.println(count);
	    
	}	
}
