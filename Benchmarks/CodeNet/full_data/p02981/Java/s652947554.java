import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		int c=a*n;

		if(b>c) {
			System.out.println(c);
		}
		else {
			System.out.println(b);
		}
	}
}
