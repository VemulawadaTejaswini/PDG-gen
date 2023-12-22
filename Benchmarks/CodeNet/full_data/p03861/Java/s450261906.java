import java.util.Scanner;

public class Main {
	public static void Main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int x =sc.nextInt();
		int count = 0;
		sc.close();
		for(int i = a; i <= b; i++) {
				if(x % a == 0) {
				count++;
				}
		continue;
		}
		System.out.println(count);
	}
}
