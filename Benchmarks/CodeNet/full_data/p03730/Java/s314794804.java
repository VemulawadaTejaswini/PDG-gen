import java.util.Scanner;

class Main{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= b; i++) {
			if(a*i % b == c) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
}