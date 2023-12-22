import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int ans[]=new int[3];
		ans[0]=a+b;
		ans[1]=a-b;
		ans[2]=a*b;
	    Arrays.sort(ans);
	    System.out.print(ans[2]);
	}
}
