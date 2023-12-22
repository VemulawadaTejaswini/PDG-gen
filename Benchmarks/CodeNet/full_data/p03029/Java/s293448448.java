import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int p = sc.nextInt();

		int total = a * 3 + p;
		System.out.println(total / 2);
	}
}