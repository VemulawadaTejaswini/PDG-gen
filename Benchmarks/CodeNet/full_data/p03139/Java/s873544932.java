import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min = Math.min(a, b);
		System.out.println(min);
		int max = Math.max(a, b);
		if(n-max < Math.min(a, b)) {
			System.out.println(Math.min(a, b)-(n-max));
		}else {
			System.out.println(0);
		}
	}
}
