import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age == 1) {
			System.out.println("Hello World");
		}else if(age == 2) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}
}