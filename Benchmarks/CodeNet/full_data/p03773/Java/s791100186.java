import java.util.Scanner;

class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int time = a + b;
		if (time > 24) {
			time -= 24;
		}
		System.out.println(time);
		
	}

}
