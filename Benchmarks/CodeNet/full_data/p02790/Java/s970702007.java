
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<Math.max(n, m);i++) {
			System.out.print(Math.min(n, m));
		}
		System.out.println();



	}

}
