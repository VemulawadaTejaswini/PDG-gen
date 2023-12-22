import java.util.*;
public class Main{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		String S = ob.next();
		int A = 0;
		int B = 0;
	        
		for(int i = 0; i < 3; i++){
			if(S.charAt(i) == 'A'){
				++A;
			}
			else{
				++B;
			}	
		}
		
		if((A > 0) && (B > 0)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
