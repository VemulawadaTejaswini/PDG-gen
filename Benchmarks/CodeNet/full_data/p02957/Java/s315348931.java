import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int mama = a*a - b*b;
		int papa = 2*a-2*b;
		if(mama%papa==0) {
			System.out.println(mama/papa);
		}else {
			System.out.println("IMPOSSIBLE");
		}
	}
}