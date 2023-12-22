import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		 int a  = in.nextInt();
		 int b  = in.nextInt();
		 int c  = in.nextInt();
		 int d  = in.nextInt();
		 
		 int x = c - a;
		 int y = d - b;
		 
		 System.out.print(c-y);
		 System.out.print(" ");
		 System.out.print(d+x);
		 System.out.print(" ");
		 System.out.print(a-y);
		 System.out.print(" ");
		 System.out.print(b+x);
	}
}