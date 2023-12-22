import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		int x = a.length();
		
		int result1 = -1;
		int result2 = -1;
		
		for(int i = 0; i < x; i++){
			
			if(a.charAt(i) == a.charAt(i+1)){
				result1 = i + 1;
				result2 = i + 2;
				break;
			}
			
			if(a.charAt(i+1) == a.charAt(i+1)){
				result1 = i + 1;
				result2 = i + 3;
				break;
			}
		}
		
		System.out.println(result1 + " " + result2);
	}
}
