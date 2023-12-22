
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		if(N%11 == 0||N%4 == 0||N%7 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}