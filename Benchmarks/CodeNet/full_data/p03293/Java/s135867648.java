import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String convertString = sc.nextLine();
		String matchString = sc.nextLine();
		char[] convertChar = convertString.toCharArray();
		String okay = "No";
		for(int i = 0; i< convertChar.length ; i++) {
			char sorttemp = convertChar[convertChar.length-1]; 
			for(int j = convertChar.length -1; j >= 1  ; j--) {
				convertChar[j] = convertChar[j-1]; 
			}
			convertChar[0] = sorttemp;
			String convertedString = String.valueOf(convertChar);
			if(convertedString.equals(matchString)) {
				okay = "Yes";
			}
		}
		System.out.println(okay);
	}

}
