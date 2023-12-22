import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		String SS = in.next();
		String T = in.next();
		
		int index = SS.length() - T.length();
		
		while(index >= 0){
			String s = SS.substring(index, index + T.length());
			
			boolean tf = true;
			for(int i = 0; i < T.length(); i++){
				if(s.charAt(i) != '?' && s.charAt(i) != T.charAt(i)){
					tf = false;
					break;
				}
			}
			
			if(tf){
				SS = new StringBuilder(SS).replace(index, index + s.length(), T).toString();
				SS = SS.replace('?', 'a');
				System.out.println(SS);
				return;
			}else{
				index--;
			}
		}
		
		System.out.println("UNRESTORABLE");
	}
}