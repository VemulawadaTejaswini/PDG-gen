import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x  = in.nextInt();
		int syou = x/500;
		int amari = x%500;
		int amari2 = amari/5;
		int result = (syou*1000)+(amari2*5);
		System.out.println(result);
	}
}
