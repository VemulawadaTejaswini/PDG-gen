import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.print(min(n*a, b));
	}
	
	public static int min(int a, int b) {
		if(a<b)
			return a;
		else
			return b;
	}

}