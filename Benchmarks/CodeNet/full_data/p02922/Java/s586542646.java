import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if(b%a==0) {
			System.out.println(b/a);
		}
		else {
			System.out.println(b/a+1);
		}
		
	}
}
