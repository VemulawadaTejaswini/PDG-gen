import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();

		List <String> kekka = new ArrayList<String>();
		String [] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

		for(int i=0; i < S.length();i++) {

			String Sone = String.valueOf(S.charAt(i));

			for(int j=0; j < 26;j++) {
				String alphabetOne = alphabet[j];
				if(Sone.equals(alphabetOne)) {

					if((j+N)<26) {
						kekka.add(alphabet[j+N]);
					}else {
						int N2 = N - 26;
						kekka.add(alphabet[j+N2]);
					}

				}
			}
		}

		for(String a:kekka) {
			System.out.print(a);
		}


	}

}
