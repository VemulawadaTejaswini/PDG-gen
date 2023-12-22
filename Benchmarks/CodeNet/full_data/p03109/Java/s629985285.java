import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calc c = new Calc();
		c.abc119A();
	}

}

class Calc{
	void abc119A() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int m = Integer.valueOf(s.substring(5,7));
		if(m>=5) {
			System.out.println("TBD");
		}else {
			System.out.println("Heisei");
		}
	}
}