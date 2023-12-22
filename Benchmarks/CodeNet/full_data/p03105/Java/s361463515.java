import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Math.min((int) Math.floor(1.0 / sc.nextInt() * sc.nextInt()), sc.nextInt()));
	}
}