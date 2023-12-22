import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int a, b, c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		if(a == 5){
			if(b == 5){
				if(c == 7)System.out.print("YES");
				else System.out.print("NO");
			}
			else if(b == 7){
				if(c == 5)System.out.print("YES");
				else System.out.print("NO");
			}
		}
		else if(a == 7){
			if(b == 5){
				if(c == 5)System.out.print("YES");
				else System.out.print("NO");
			}
			else System.out.print("NO");
		}
		else System.out.print("NO");


	}
}