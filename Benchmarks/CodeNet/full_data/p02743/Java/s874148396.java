import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		sc.close();
		long temp = (long)c-a-b;
		if(temp>0 && 4*a*b<temp*temp) System.out.println("Yes");
		else System.out.println("No");
	}
}