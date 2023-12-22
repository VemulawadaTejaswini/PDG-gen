import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		long res = n/(a+b);
		long mod = n%(a+b);
		if(mod>=a)
			mod = a;
		
		System.out.println(res*a+mod);
}

}
