import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		for(int index = S.length()-1; index >= 0; index -= 2){
			String s1 = S.substring(0, (index + 1) / 2);
			String s2 = S.substring((index + 1) / 2, index + 1);
			//System.out.println(s1 + " " + s2);
			if(s1.equals(new StringBuilder(s2).reverse().toString())){
				System.out.println(s1.length() * 2);
				return;
			}
		}
	}
}