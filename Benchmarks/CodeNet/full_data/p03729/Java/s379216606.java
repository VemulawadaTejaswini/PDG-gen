import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		Scanner cin = new Scanner(System.in);
		
		String A = cin.next();
		int lenA = A.length();
		String B = cin.next();
		int lenB = B.length();
		String C = cin.next();
		
		String result = "YES";
		
		if(A.charAt(lenA)==B.charAt(0)&&B.charAt(lenB)==C.charAt(0)){
			
		}else{
			result = "NO";
		}
		
		System.out.println(result);
	}
}
