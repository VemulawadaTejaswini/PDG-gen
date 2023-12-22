import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		String S = sc.next();
	
		if(S.length() == 2){
			System.out.println(S);
		}
		else{
			String printS = String.valueOf(S.charAt(2)) + String.valueOf(S.charAt(1)) + String.valueOf(S.charAt(0));
			System.out.println(printS);
		}
	}
}