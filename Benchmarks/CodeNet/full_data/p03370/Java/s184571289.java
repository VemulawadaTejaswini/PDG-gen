import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int x=scanner.nextInt();
		int m[]=new int [n];
		
		for(int i=0;i<n;i++) {
			m[i]=scanner.nextInt();
			x-=m[i];
		}
		Arrays.sort(m);
		
		System.out.println(x/m[0]+n);
	}
}
