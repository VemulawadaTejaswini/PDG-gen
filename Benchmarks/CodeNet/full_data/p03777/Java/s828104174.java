import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if(a.equals(b)) {
			System.out.println("H");
		}else {
			System.out.println("D");
		}
	}
}
