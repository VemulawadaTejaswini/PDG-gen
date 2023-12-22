import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		if(a+b>c+d) {
			System.out.println("Left");
		}
		else if(a+b<c+d){
		System.out.println("Right");
	}
		else {
			System.out.println("Balanced");
		}
		}
}