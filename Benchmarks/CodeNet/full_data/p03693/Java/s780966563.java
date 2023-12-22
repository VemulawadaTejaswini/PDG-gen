import java.io.*;
import java.util.*;
public class Main{ // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int red = sc.nextInt();
		//int gree = sc.nextInt().nextInt();
		//int blue = gree.nextInt();
		// 1. 3numbers from 1 to 9
		// 2. get integer to char
		// 3. char to integer
		// 4. Var divide 4  == 0  
		
		System.out.printf("%d\n", red);
		if(red / 4 ==0){
			System.out.printf("YES");
		}

		System.out.printf("NO");
	}
}