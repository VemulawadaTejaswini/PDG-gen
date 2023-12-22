import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		boolean ans = true;
		
		if(!(S.charAt(0) == 'A')) ans = false;
		
		String SS = S.substring(2, S.length()-1);
		int count = 0;
		for(int i = 0; i < SS.length(); i++){
			if(SS.charAt(i) == 'C') count++;
		}
		if(!(count == 1)) ans = false;
		
		count = 0;
		for(int i = 0; i < S.length(); i++){
			if(S.charAt(i) == 'A') continue;
			if(S.charAt(i) == 'C') continue;
			if(S.charAt(i) >= 'a' && S.charAt(i) <= 'z') continue;
			ans = false;
		}
		
		System.out.println(ans?"AC":"WA");
	}
}