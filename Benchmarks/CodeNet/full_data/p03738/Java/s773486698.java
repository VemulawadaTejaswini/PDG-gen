import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		String A = io.next();
		String B = io.next();
		
		int result = A.length()-B.length();
		
		if(result==0){
			for(int i = 0;i<A.length();i++){
				int a = Character.getNumericValue(A.charAt(i));
				int b = Character.getNumericValue(B.charAt(i));
				if(a-b!=0) {
					result = a-b;
					break;
				}
			}
		}
		System.out.println((result>0)? "GREATER":
							(result<0)? "LESS":
										"EQUAL");
		
	}
}