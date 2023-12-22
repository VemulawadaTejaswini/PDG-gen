import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int i = b - a;
		double high = 0.5 * i * (i + 1);

		int x = (int)high - b;

		System.out.println(x);
	}
}
