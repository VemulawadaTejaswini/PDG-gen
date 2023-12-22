import java.util.*;
public class Main {
	public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
		// get a integer
		int a = sc.nextInt();
		// get two integers separated with half-width break
		int[] b = new int[a];
		for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		int count = 0;
		
		for (int i = 0; i < a; i++) {
			if (b[i] == (i+1)) {
				count = 0;
                                System.out.println(count);
				return;
			}	
		}
			
		if (a % 2 == 0) {
			for (int i = 0; i < (a/2); i++) {
				if ( (b[b[i]-1] == i+1) )
					count++;
			}
		}
		else {
			for (int i = 0; i < (a/2)+1; i++) {
				if ( (b[b[i]-1] == i+1) )
					count++;
			}
		}
				
		System.out.println(count);
	}
}