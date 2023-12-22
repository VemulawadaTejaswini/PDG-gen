import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		
		String a =S.substring(0, 1)+Integer.toString(S.substring(1, S.length()-1).length())
		+S.substring(S.length()-1, S.length());
		
		System.out.println(a);
		
	}
}