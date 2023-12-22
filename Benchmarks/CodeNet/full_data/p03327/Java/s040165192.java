import java.util.*;
public class Main {
	public static void main(String[] args){
		ABD();
	}
	
	public static void ABD() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num <= 999) {
			System.out.println("ABC");
		}
		else {
			System.out.println("ABD");
		}
	}
}