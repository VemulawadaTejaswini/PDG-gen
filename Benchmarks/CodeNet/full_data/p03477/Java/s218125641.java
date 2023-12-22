import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int ABCD = sc.nextInt() + sc.nextInt() - sc.nextInt() - sc.nextInt();
		
		if(ABCD == 0) System.out.println("Balanced");
		else System.out.println(ABCD > 0 ? "Left" : "Right");
	}
}