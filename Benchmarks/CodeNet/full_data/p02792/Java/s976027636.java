import java.math.BigInteger;
import java.util.*;
public class Main {

	public static boolean isOK(int i, int j) {
		char[] str_i = String.valueOf(i).toCharArray();
		char[] str_j = String.valueOf(j).toCharArray();
		
		return str_i[0] == str_j[str_j.length - 1] && str_i[str_i.length -1] == str_j[0];
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		int ans = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(isOK(i, j)) {
					ans++;
				}
				
			}
		}

		System.out.println(ans);



		
		
		
		
		

		


		
		
	}
	


}

 