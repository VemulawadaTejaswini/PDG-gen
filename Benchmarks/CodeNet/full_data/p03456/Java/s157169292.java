import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		int ab = Integer.parseInt(a + b);
		int sqrt = (int)Math.floor(Math.sqrt(ab));
		System.out.println((sqrt * sqrt == ab)?"Yes":"No");
		
	}
}