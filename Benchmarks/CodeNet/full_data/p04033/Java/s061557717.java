import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt(),b=stdIn.nextInt();
		if(0>=a&&b>=0||a>=0&&0>=b) System.out.print("Zero");
		else if(0>a&&0>b&&(a-b)%2==0) System.out.print("Negative");
		else System.out.print("Positive");
	}
}