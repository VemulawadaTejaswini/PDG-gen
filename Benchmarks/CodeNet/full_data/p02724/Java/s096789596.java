import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int g = x/500 * 1000;
		int y = x%500;
		g = g + y/5 * 5;

		System.out.println(g);
	}
}