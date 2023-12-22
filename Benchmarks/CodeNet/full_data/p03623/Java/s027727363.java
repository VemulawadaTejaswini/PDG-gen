import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		ax = Math.abs(a-x);
		bx = Math.abs(b-x);
		
		if(ax<bx){
			System.out.println(ax);
		} else{
			System.out.println(bx);
		}
	}
}