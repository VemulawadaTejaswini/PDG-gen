import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int A = sc.nextInt();
		int B = sc.nextInt();

		double x=0;
		double y=0;
		x=A/0.08;
		y=(B+0.5)/0.1;
		int X=(int)x;
		int Y=(int)y;
		if(A%2==0&&B%2==0)
		System.out.println(Math.max(X,Y));
		else
		System.out.println("-1");
	}
}
		 


