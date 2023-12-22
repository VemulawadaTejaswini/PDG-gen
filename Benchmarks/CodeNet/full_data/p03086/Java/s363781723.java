import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> atcg = new ArrayList<String>();
		atcg.add("A");
		atcg.add("C");
		atcg.add("G");
		atcg.add("T");

		Scanner in = new Scanner(System.in);
		String[] S = in.next().split("");
		int max = 0;
		int len = 0;
		for (int i = 0; i < S.length; i++) {
			if(atcg.contains(S[i])) {
				len++;
			}else {
				if(len > max) {
					max = len;
				}
				len=0;
			}
		}

		in.close();
		System.out.println(max);
	}

}