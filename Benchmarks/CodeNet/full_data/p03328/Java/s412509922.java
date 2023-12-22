import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int sub = b - a;

		int t = 0;
		for(int i=1; i<=sub; i++) {
			t += i;
		}
		System.out.print(t-b);
		in.close();
		
	}
}