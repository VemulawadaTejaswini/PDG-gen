import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);
		
		//Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Y = sc.nextInt();
		
		for(int x = 0; x <= N; x++){
			if(10000 * x > Y) continue;
			for(int y = 0; y <= N - x; y++){
				int z = N - x - y;
				int xx = 10000 * x;
				int yy = 5000 * y;
				int zz = 1000 * z;
				if(xx + yy + zz == Y){
					System.out.println(x + " " + y + " " + z);
					//System.out.println(xx + " " + yy + " " + zz);
					return;
				}
			}
		}
		
		System.out.println("-1 -1 -1");
	}
}