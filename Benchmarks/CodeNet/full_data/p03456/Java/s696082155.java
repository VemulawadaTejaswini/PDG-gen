import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();

		if(b < 10){
			a *= 10;
		}else if(b < 100) {
			a *= 100;
		}else
			a *= 1000;

		int c = a + b;

		if(((int) Math.sqrt(c)) * ((int) Math.sqrt(c)) == c)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
