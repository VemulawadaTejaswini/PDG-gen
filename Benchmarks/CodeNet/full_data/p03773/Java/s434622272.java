import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a+b>24) {
			System.out.println(a+b-24);
		}
		else {
			System.out.println(a+b);
		}
	}
}