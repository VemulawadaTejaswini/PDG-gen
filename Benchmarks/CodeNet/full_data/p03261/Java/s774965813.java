import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] w = new String[n];

		for (int i=0; i<n; i++){
			w[i] = sc.next();
		}

		String beforeWord = "";
		String currentWord = "";
		HashSet<String> pastWord = new HashSet<String>();

		for (int i=0; i<n; i++){
			beforeWord = currentWord;
			currentWord = w[i];
			if (i > 0){
				String befLast = beforeWord.substring(beforeWord.length()-1);
				String curStart = currentWord.substring(0, 1);
				if (!befLast.equals(curStart)){
					System.out.println("No");
					return;
				}
			}
			if (pastWord.contains(currentWord)){
				System.out.println("No");
				return;
			}
			pastWord.add(currentWord);
		}
		System.out.println("Yes");
	}
}