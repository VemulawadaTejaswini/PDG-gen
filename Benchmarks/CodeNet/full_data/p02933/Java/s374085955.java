import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = Integer.parseInt(s.nextLine());
		String si = s.nextLine();
		if(a<3200) {
			System.out.println("red");
		}else {
			System.out.println(si);
		}

	}

}
