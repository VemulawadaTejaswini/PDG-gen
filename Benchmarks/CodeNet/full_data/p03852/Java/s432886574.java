import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		String c;
		String msg;
		
		Scanner scan = new Scanner(System.in);
		c = scan.next();
		
		scan.close();
		
		if( "a".equals(c) || "i".equals(c) || "u".equals(c) || "e".equals(c) || "o".equals(c) ){
			msg = "vowel";
		}else{
			msg = "consonant";
		}
		
		System.out.println(msg);
	}
}