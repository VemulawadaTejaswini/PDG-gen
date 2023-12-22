
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int x=k;
		int c=1;
		while(x<n) {
			x=k*x;
			c++;
		}
		System.out.println(c);

	}

}
