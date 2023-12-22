import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		String op = sc.next();
		long b = sc.nextLong();
		System.out.println(op.equals("+") ? a + b : a - b);
	}
}
