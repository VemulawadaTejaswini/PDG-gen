import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = (b * 2 >= a) ? 0 : a - b * 2;
		System.out.println(ans);
	}
}