import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		String input = scan.next();
		int len = input.length();
		int num = scan.nextInt();

		// check
		long answer = 0;
		boolean sameChar = true;
		char ch = input.charAt(0);
		for(int i = 1; i < len; i++) {
			if(input.charAt(i) != ch) {
				sameChar = false;
				break;
			}
		}
		if(len == 1) {
			answer = num / 2;
		} else if (len % 2 == 0 && sameChar) {
			answer = (len / 2) * num;
		}else if(len % 2 == 1 && num % 2 == 0 && sameChar){
			answer = (len / 2) * (num / 2) + (len / 2 + 1) * (num / 2);
		} else if(len % 2 == 1 && num % 2 == 1 && sameChar){
			answer = (len / 2) * (num / 2 + 1) + (len / 2 + 1) * (num / 2);
		} else {

			long count = 1;
			char temp = input.charAt(0);
			for(int i = 1; i < len; i++){
				if(input.charAt(i) == temp){
					count++;
					if(i == len - 1) {
						answer += count / 2;
					}
				} else {
					answer += count / 2;
					count = 1;
					temp = input.charAt(i);
				}
			}

			// check2
			input = input.concat(input);
			len = input.length();
			long answer2 = 0;
			count = 1;
			temp = input.charAt(0);
			for(int i = 1; i < len; i++){
				if(input.charAt(i) == temp){
					count++;
					if(i == len - 1) {
						answer2 += count / 2;
					}
				} else {
					answer2 += count / 2;
					count = 1;
					temp = input.charAt(i);
				}
			}

			answer = answer + (answer2 - answer) * (num - 1);
		}

		System.out.println(answer);

	}
}
