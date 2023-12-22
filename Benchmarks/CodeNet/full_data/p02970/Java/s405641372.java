import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d= sc.nextInt();
		int count=0;
		for(int i=d;i<n;i++) {
			if(i%d==1) count++;
		}
		System.out.println(count);
	}
}
