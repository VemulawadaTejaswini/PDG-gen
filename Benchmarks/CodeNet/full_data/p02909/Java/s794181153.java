import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = null;
		
		try {
			s = args[0];
//			String[] s = scanner.nextLine().split(" ");
		} catch (NumberFormatException e) {
		} catch (NullPointerException e) {
		}

		if(s.equals("Sunny")) {
			s = "Cloudy";
		}else if(s.equals("Cloudy")) {
			s = "Rainy";
		}else {
			s = "Rainy";
		}
		
		scanner.close();
		
	 	System.out.println(s);
	}
}
