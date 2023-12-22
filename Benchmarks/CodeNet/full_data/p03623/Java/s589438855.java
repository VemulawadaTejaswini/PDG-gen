import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int distance_ax = Math.abs(a-x);
		int distance_bx = Math.abs(b-x);
		
		if (distance_ax>=distance_bx){
			 System.out.println("B");	
		}else {
			 System.out.println("A");
		}
	}
}