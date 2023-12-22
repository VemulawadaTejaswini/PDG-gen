import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int max = 0;
		int a = 0,b = 0;
		if(y + 2*z <= x) {
		a = x / (y + 1) ;
		b = a / z ;
		max = b ;
		}
		System.out.println(max);
	}
}
