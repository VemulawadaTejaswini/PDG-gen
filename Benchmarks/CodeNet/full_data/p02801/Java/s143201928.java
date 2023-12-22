import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc151_a();
	}
	
	
	public static void solve_abc151_a(){
		
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		
		String[] s = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r",
						"s","t","u","v","w","x","y","z"};
		
		int ci = 0;
		
		for(int si=0;si<s.length;si++){
			
			if(c.equals(s[si])){
				ci = si;
				break;
			}
		}
		
		System.out.println(s[ci+1]);
		sc.close();
	}
}