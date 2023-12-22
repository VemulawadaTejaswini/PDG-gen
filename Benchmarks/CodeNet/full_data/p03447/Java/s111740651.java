import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt(),a=stdIn.nextInt(),b=stdIn.nextInt();
		System.out.print((x-a)-((x-a)/b)*b);
	}
}