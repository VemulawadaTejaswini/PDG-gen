import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		if((in.nextInt() * in.nextInt()) % 2 != 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}