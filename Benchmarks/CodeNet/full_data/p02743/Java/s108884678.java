import java.util.Scanner;

public class main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextInt();
		long b = scanner.nextInt();
		long c = scanner.nextInt();
		
		long x = c-a-b;
		
		long y = x*x - 4*a*b;
		
		if((x>0)&&(y>0)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
}