import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),m=stdIn.nextInt();
		System.out.print((n-1)*(m-1));
	}
}