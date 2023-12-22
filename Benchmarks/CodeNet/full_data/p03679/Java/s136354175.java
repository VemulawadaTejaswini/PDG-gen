import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x,a,b;
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		a=in.nextInt();
		b=in.nextInt();
		 if(b-a<=x)
			 {
			 if(a+b==x) System.out.println("delicious");
			 else System.out.println("safe");
			 
			 }
		else if(b-a>x)System.out.println("dangerous");
	}
}