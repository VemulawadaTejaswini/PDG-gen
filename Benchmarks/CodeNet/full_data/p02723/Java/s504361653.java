
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		String [] strArray = new String[S.length()];

		for (int i=0; i<S.length(); i++) {
			String ans = String.valueOf(S.charAt(i));
			strArray[i] = ans;

		}
		List<String> s3 = Arrays.asList(strArray[2]);
		List<String> s4 = Arrays.asList(strArray[3]);
		List<String> s5 = Arrays.asList(strArray[4]);
		List<String> s6 = Arrays.asList(strArray[5]);

		if (Collections.disjoint(s3,s4) || Collections.disjoint(s5,s6)) {
			
			System.out.print("No");

		}else {
			System.out.print("Yes");
		}

		}
	}





