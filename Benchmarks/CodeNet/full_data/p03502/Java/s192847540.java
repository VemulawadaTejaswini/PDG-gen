import java.util.Scanner;

public class Main {

	public static int f(int n) {
		int count = 0;
		if(n < 10)return n;
		count += n % 10;
		count += f(n / 10);
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int h = f(n);
		if(n % h == 0)System.out.println("Yes");
		else System.out.println("No");
	}

}
