import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a = n/1000000000;
		int b = (n/100000000)%10;
		int c = (n/10000000)%10;
		int d = (n/1000000)%10;
		int e = (n/100000)%10;
		int f = (n/10000)%10;
		int g = (n/1000)%10;
		int h = (n/100)%10;
		int i = (n%10);

		int sum = a+b+c+d+e+f+g+h+i;

		boolean t = false;

		if(n%sum ==0) t = true;

		if(t==true) System.out.print("Yes");
		else System.out.print("No");

	}

}
