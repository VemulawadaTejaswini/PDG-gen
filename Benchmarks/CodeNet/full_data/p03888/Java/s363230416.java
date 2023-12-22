import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r1 = sc.nextDouble();
		double r2 = sc.nextDouble();
		System.out.println(1 / (1 / r1 + 1 / r2));
	}
}