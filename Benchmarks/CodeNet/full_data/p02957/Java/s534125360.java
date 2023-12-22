import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(long i=0;i<Long.MAX_VALUE;i++) {
			if(Math.abs(a-i)==Math.abs(b-i)) {
				System.out.println(i);
				return;
			}
		}
	}
}