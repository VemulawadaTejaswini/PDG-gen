import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		if(4*a*b < c*c-2*a*c-2*b*c+a*a+2*a*b+b*b){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
