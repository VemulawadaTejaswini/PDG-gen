import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int keisu = n/(a+b);
		int mod = n % (a+b);
		
		int ret = a*keisu + (mod>a ? a : mod);
		System.out.println(ret);
	}
}
