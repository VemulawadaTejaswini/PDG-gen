import java.util.*;
import java.io.*; 

public class Main {
	
	public static void main(String... string) {
		Scanner sc = new Scanner(System.in); 
		long n = sc.nextLong(); 
		long blue = sc.nextLong();
		long red = sc.nextLong();
		if(blue == 0) blue = 0; 
		else if(red == 0) ; 
		else {
			blue = n - red; 
		}
		System.out.println(blue); 
		
	}
}