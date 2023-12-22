import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a%2==0 || b%2==0 || c%2==0){
			System.out.println("0");
		}	else {
			long l = Math.min((long)a*b,(long)b*c);
			l=Math.min(l, (long)c*a);
			System.out.println(l);
		}
		
	}
}