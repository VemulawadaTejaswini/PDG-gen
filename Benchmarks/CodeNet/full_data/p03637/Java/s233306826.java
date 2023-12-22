import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int sum0 = 0, sum2 = 0;
		
		for(int i = 0; i < N; i++) {
			int a = in.nextInt();
            if(a % 2 != 0) sum0++;
            else if(a % 4 == 0) sum2++;
		}
		
		System.out.println((sum2 >= sum0) ? "Yes" : "No");
	}
}
