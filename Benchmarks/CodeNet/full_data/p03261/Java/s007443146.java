import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String prevWord = sc.nextLine();

		boolean good = true;
		for(int i = 0; i < n; i++){
			String currWord = sc.nextLine();
			if(i != 0 && currWord.charAt(0) != prevWord.charAt(prevWord.length() - 1)){
				good = false;
			}
			prevWord = currWord;
		}

		if(good){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}