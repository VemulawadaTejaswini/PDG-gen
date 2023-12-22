import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String ans = "Yes";
		List<String> list = new ArrayList<>();
		sc.nextLine();
		String word = sc.nextLine();

		list.add(word);
		String strfin = word.substring(word.length()-1);

		for(int i = 0; i < N-1; i++) {
			word = sc.nextLine();

			if(ans.equals("No")) {
				continue;
			}
			if(!(word.substring(0,1).equals(strfin))){
				ans = "No";
				//System.out.println(word + " " + word.substring(0,1) +"　"+ strfin);
			}

			for(int j = 0; j <= i; j++) {
				if(word.equals(list.get(j))) {
					ans = "No";
					//System.out.println(word + " "+ list.get(j));
				}
			}
			list.add(word);
			strfin = word.substring(word.length()-1);
		}


		System.out.println(ans);
		sc.close();
	}

}