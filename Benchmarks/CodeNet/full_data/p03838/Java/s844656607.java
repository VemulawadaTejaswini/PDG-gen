import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		if (x>=0&&y>=0||x<0&&y<0) {
			if (x>y) {
				int cnt = Math.abs(y-x);
				System.out.println(cnt+2);
			}else System.out.println(y-x);
		}else {
			int tempx = Math.abs(x);
			int tempy = Math.abs(y);
			System.out.println(Math.abs(tempx-tempy)+1);
		}
	}
	/*Cases:
	 * 1. abs(y-x)
	 * 2. 
	 * 
	 * */
}