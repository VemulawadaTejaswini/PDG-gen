import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int[] ex = new int[26];
		int index = 0;
		for(int i = 0; i < S.length(); i++){
			int c = S.charAt(i) - 'a';
			//System.out.println(c);
			ex[c] = 1;
		}
		
		for(int i = 0; i < ex.length; i++){
			if(ex[i] == 0){
				char c = (char)('a' + i);
				System.out.println(c);
				return;
			}
		}
		System.out.println("None");
	}
}