import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = 0;
		int b = 0;
		
		a = n / k;
		b = a + n % k;
		
		if (a>b){
			System.out.println(a-b);
		}
		else {
			System.out.println(b-a);
		}
		
		
		
		
		
	}

}
