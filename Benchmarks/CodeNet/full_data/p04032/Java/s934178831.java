import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		int x = a.length();
		
		for(int i = 1; i < x; i++){
			
			if(a.charAt(i) == a.charAt(i-1)){
				System.out.println(i + " " + (i + 1));
				System.exit(0);
			}
		}
		for(int i = 2; i < x; i++){
			
			if(a.charAt(i) == a.charAt(i-2)){
				System.out.println((i - 1) + " " +(i + 1));
				System.exit(0);
			}
		}
		
		System.out.println(-1 + " " + -1);
	}
}
