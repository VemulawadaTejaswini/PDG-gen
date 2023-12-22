import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String n = sc.nextInt();
		System.out.println((4^n-3*(n-2)-6*(n-3))%(10^9+7));
	}
}