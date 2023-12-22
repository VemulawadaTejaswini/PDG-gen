import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();	
		if(S.charAt(2)==S.charAt(3) && S.charAt(4)==S.charAt(5)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}