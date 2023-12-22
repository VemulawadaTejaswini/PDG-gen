import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		sc.close();
		if(b.contains("A")) {
			System.out.println("T");
		}else if(b.contains("T")) {
			System.out.println("A");
		}else if(b.contains("C")) {
			System.out.println("G");
		}else if(b.contains("G")) {
			System.out.println("C");
		}
	}

}