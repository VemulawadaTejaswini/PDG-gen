import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a==b) {
			System.out.println(a);
		}
		else if(a>b) {
			System.out.println(b);
		}
		else if(a<b) {
			System.out.println(a);
		}

	}

}