import java.util.Scanner;


class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int a, b, c, d;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		if(a <= c && c <= b)
			if(b >= c)System.out.print(b-c-a);
			else System.out.print(d-c);
		else if(c <= a && a <= d)
			if(d >= a)System.out.print(d-a-c);
			else System.out.print(b-a);
		else System.out.print(0);
		
	}
}