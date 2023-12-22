import java.util.*;
public class Main{
	public static final Scanner in =  new Scanner(System.in);
	public static void main(String args []){
		String s =in.next();
		char a = s.charAt(2);
		char b = s.charAt(3);
		char c= s.charAt(4);
		char d = s.charAt(5);
		if(a==b && c==d){
			System.out.print("Yes");
			
		}else{
			System.out.print("No");
		}
		
	
		
	}
}
