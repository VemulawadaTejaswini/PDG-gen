import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);	
		
		String str = scan.next();
		String s = "";
		for(int i = 0 ; i < str.length() ; i++){
			
			s += str.charAt(i) + "";
			
			if(i == 3){
				s += " ";
			}
		}
		
		System.out.println(s);
		
	}
}
