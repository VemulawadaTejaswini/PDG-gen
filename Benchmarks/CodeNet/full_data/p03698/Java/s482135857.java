import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String inputS = scanner.next();
		
		if(hasSameChar(inputS)) {
			System.out.println("no");
		}else {
			System.out.println("yes");
		}

		scanner.close();

	}
	

	static boolean hasSameChar(String inputS) {
		for (int i = 0; i < inputS.length() ; i++) {

			char buf = inputS.charAt(i);

			for (int j = 0; j < inputS.length() ; j++) {
				
				if(i==j) {continue;};

				if (buf == inputS.charAt(j)) {
					return true;
				}

			}

		}
		
		return false;

	}

}
