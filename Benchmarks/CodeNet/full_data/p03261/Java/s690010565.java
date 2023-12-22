import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String words[] = new String[num];
		for(int i = 0; i < num; i ++) {
			words[i] = sc.next();
		}
		boolean isCorrect = true;

		end: for(int i = 1; i < num; i ++) {
			for(int j = 0; j < i; j ++) {
				if(words[i].equals(words[j])) {
					isCorrect = false;
					break end;
				}
			}
		}
		if(isCorrect) {
			end: for(int i = 1; i < num; i ++) {
				char firstChar = words[i].charAt(0);
				char lastChar = words[i - 1].charAt(words[i - 1].length() - 1);
				if(firstChar != lastChar) {
					isCorrect = false;
					break end;
				}
			}
		}
		System.out.println(isCorrect ? "Yes" : "No");
	}
}