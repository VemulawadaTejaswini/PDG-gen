
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		if(x>500*n)
			System.out.println("No");
		else
			System.out.println("Yes");


	}

}
