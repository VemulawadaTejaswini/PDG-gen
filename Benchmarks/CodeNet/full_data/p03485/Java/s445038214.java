import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Calc(a,b));
		
	}
	
	public static int Calc(int a,int b) {
		int c = a + b;
		if (c % 2 == 0) {
			return  c/2;
			
		} else {
			return (int)(c/2) + 1;
		}
	}

}
