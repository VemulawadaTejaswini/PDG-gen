import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(a <= b && a <= c) System.out.println(Math.abs(b-c));
		else if(b <= a && b <= c) System.out.println(Math.abs(a-c));
		else System.out.println(Math.abs(a-b));
	}
}