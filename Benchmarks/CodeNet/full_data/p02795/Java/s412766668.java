import java.math.BigInteger;
import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		
		boolean longerThanHeight = w > h;
		int ans = 0;
		if(longerThanHeight) {
			ans = n / w + 1;
		} else {
			ans = n / h + 1;
		}


		
		
		System.out.println(ans);
		
		
		
		

		
		
	}

}

 