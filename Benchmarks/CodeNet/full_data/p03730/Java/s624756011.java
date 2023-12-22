import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		int check=0;
		for(int i=1;i<=100;i++) {
			if((a*i)%b==c) {
				check=1;
				break;
			}
		}
		System.out.println((check==1)? "YES":"NO");

	}
}