import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (X < 0) {
		    System.out.println("dangerous");
		    return ;
		}
		if (B - A < 0) {
		    System.out.println("delicious");
		    return ;
		}
		if (B - A <= X) {
		    System.out.println("safe");
		    return ;
		}
		if (B - A > X) {
		    System.out.println("dangerous");
		    return ;
		}
	}
}
