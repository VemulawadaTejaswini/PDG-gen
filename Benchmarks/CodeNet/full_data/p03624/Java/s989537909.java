import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		String alp = "abcdefghijklmnopqrstuvwxyz{";
		int index = 0;
		for(int i = 0; i < S.length(); i++){
			if(alp.charAt(index) == S.charAt(i)) index++;
		}
		System.out.println((index == alp.length() - 1) ? "None" : alp.charAt(index));
	}
}