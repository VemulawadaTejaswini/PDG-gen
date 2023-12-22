import java.util.*;
import java.io.FileInputStream;
import java.io.InputStream;
 
public class Main {
 
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		File file = new File("input.txt");
      	Scanner sc = new Scanner(file);
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	if(n*500 >= k)
          System.out.println("YES");
      	else
          System.out.println("NO");
		
	}
	
}