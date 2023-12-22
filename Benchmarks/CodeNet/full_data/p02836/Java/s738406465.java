import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] b = a.split("");
		List<String> word = new ArrayList<String>();
		List<String> rev_word = new ArrayList<String>();

		for(int s=0;s<b.length;s++) {
			word.add(b[s]);
			rev_word.add(b[s]);
		}
		Collections.reverse(rev_word);
		int count=0;
		for(int i=0;i<word.size();i++) {
			if(!word.get(i).equals(rev_word.get(i))) count++;
		}
		System.out.println(count/2);
	}
}