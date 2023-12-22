import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(2 * a -1);
		}else if(b>a) {
			System.out.println(2 * b -1);
		}else {
			System.out.println(a + b);
		}
	}
}