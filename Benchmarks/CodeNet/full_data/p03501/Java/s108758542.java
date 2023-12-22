import java.util.Scanner;
public class test{
	public static void main(String[] args) { 
　　　　Scanner sc = new Scanner(System.in);
 		int n  = sc.next();
	       int  a  = sc.next();
	      int b  = sc.next();
		if (n * a > b) { 
			System.out.println(b);		
             } else {
			System.out.println(n * a);
		}
	}
}
