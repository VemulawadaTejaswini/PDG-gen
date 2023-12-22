import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		int sum = 0;
		for(int i = 1; i < S.length(); i++) {
			if(S.substring(i - 1, i).equals(S.substring(i, i + 1))) {
				
			} else {
				sum++;
			}
		}
		
		System.out.println(sum);
		
		scan.close();
	}

}
