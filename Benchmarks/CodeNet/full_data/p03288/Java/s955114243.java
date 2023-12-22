import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int r=stdIn.nextInt();
		if(1200>r) System.out.print("ABC");
		else if(2800>r) System.out.print("ARC");
		else System.out.print("AGC");
	}
}