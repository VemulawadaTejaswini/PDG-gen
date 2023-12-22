import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String in1 = scanner.nextLine();
		String in2 = scanner.nextLine();
		String res = "No";
		for(int i = 0; i < in1.length(); i++) {
			if(in2.equals(in1.substring(i) + in1.substring(0, i ))){
				res = "Yes";
				break;
			}
		}
		System.out.println(res);
	}

}