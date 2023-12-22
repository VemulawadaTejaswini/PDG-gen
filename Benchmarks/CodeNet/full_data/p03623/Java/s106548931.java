import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((Math.abs(x-a) < Math.abs(x-b)) ? "A" : "B");
	}
}