import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		String input = scan.next();
		int len = input.length();
		char[] inputChar = input.toCharArray();
		LinkedList<Character> word = new LinkedList<>();
		for(int i = 0; i < len; i++){
			word.add(inputChar[i]);
		}
		System.out.println(word);
		// check
		for(int i = 0; i < len; i++){
			if(word.get(0) == 'K' && word.get(1) == 'I'){
				word.add('A');
				word.add(word.poll());
				word.add(word.poll());
				i++;
			} else if (word.get(0) == 'H' && word.get(1) != 'A'){
				word.add(word.poll());
				word.add('A');
			} else if (word.get(0) == 'B' && word.get(1) != 'A'){
				word.add(word.poll());
				word.add('A');
			} else if (word.get(0) == 'R'){
				word.add(word.poll());
				word.add('A');
			} else {
				word.add(word.poll());
			}
		}
		System.out.println(word);
		String answer = "";
		while(word.size() > 0){
			answer = answer.concat(String.valueOf(word.poll()));
		}

		// answer
		if(answer.indexOf("AKIHABARA") == -1){
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

	}
}

