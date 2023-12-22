
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),a=scan.nextInt(),b=scan.nextInt();
		if(a*n<b) {
			System.out.println(a*n);
		}
		else {
			System.out.println(b);
		}

	}

}