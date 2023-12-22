import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int fee = sc.nextInt();
		System.out.println(age >= 13 ? fee : age <= 5 ? 0 : fee / 2);
	}
}