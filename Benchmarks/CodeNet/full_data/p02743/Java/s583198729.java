import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		if(4*a*b<(c-a-b)*(c-a-b)) {
			if(c-b-a<=0) {
				System.out.println("No");
			}else {
			System.out.println("Yes");}
		}else {
			System.out.println("No");
		}
}}
