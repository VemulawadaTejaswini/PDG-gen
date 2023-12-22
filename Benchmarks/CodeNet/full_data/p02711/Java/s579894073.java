import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		String[] tempList = new String[3];
		int result = 0;
		for(int i = 0; i < 3 ; i++) {
			tempList[i] = String.valueOf(temp.charAt(i));
			if(tempList[i].equals("7")) {
				result = 1;
				break;
			}
		}



		if(result == 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
