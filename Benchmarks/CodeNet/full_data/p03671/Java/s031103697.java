import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if(a>=b && a>=c){
			int sum = b + c;
			System.out.println(sum);
		}else if(b>=a && b >=c){
			int sum = a + c;
			System.out.println(sum);
		}else{
			int sum = a + b;
			System.out.println(sum);
		}

	}

}
