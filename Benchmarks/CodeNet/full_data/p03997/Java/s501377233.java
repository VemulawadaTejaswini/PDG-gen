import java.util.*;


public class Main {
	public static void main(String[] args) {
		int a; //（上辺）
		int b; //（底辺）
		int h; //（高さ）
		int s; //（面積）
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		h = sc.nextInt();
		
		s = ( a + b ) * h / 2;
		
		System.out.println("面積は " + s);
	}
}