import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int ans = 0;
		
		int x = n/(a+b);
		int y = n%(a+b);
		if(y>a) {
			ans += y-b;
		}else {
			ans += y;
		}
		System.out.println(ans+(x*a));
		
	}	
}
