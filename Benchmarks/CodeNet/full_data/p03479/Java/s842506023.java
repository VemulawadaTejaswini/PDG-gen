import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		long X = in.nextLong();
		long Y = in.nextLong();
		long a = X;
		int ans = 1;
		
		while(2 * a <= Y){
			a = 2 * a;
			ans++;
		}
		
		System.out.println(ans);
	}
}