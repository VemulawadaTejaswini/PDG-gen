import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int count=1;
		for(int i=0;i!=a;i++) {
			count*=100;
		}
		System.out.println(count*b);
	}
}