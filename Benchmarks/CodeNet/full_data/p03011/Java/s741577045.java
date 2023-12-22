import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		if(p>r && p>q)
			System.out.print(q+r);
		else if(r>q)
			System.out.print(p+q);
		else
			System.out.print(p+r);
	}
}