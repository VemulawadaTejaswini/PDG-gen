import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt(),b=stdIn.nextInt(),c=stdIn.nextInt(),d=stdIn.nextInt();
		if(a>b) {
			if(c>d) System.out.print(b+d);
			else System.out.print(b+c);
		}
		else {
			if(c>d) System.out.print(a+d);
			else System.out.print(a+c);
		}
	}
}