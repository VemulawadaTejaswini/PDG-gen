import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
		sc.close();

		int ans = 0;
		if(op.equals("+")) ans = a + b;
		else ans = a - b;

		System.out.println(ans);
	}
}