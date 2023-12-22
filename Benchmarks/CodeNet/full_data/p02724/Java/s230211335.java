import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc =new Scanner (System.in);
		int x=sc.nextInt();
		int y=x/500;
		x=x%500;
		int z=x/5;
		System.out.println(1000*y+5*z);
	}
}
