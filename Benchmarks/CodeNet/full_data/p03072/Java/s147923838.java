import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); 
		
		int[]h = new int[n];
		
		h[0] = stdIn.nextInt();
		
		int cnt = 1;
		
		for(int i = 1; i < n; i++) {
			h[i] = stdIn.nextInt();
			if(h[i]>=h[0]) {
				cnt++;
			}
			
			
		}
		System.out.println(cnt);
		
		
	}

}
