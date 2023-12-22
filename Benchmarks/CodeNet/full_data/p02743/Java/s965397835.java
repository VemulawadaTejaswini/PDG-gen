import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a, b,c;
		a = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
		if (c < a+b) {
			System.out.println("No");
			return ;
		}
		long result = c-a-b;
		result= result*result;
		if(result >4*a*b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}