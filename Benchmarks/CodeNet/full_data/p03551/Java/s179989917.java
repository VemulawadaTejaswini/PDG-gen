import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		int t = m * 1900 + (n-m) * 100;
		System.out.println(t*(int)Math.pow(2, m));
	}
}
