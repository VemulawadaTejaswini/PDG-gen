import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int big=a>=c?a:c;
		int big2=b>=d?d:b;
		if(a==c&&b==d) {
			System.out.println(b);
		}
		else if(c<b) {
			System.out.println(big2-big);
		}
		else if(b<c){
			System.out.println(0);
		}
		}
}