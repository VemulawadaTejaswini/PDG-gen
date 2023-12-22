import java.util.Scanner;

public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		String answer = "";
		
		// 問題の入力を受け取る
		String input = scan.next();
		int len = input.length();
		
		for(int i = 0; i < len; i++){
			switch(input.charAt(0)){
				case '0':
					if(input.length() > 0){
						input = input.substring(1);
					}
					answer = answer.concat("0");
					break;
				case '1':
					if(input.length() > 0){
						input = input.substring(1);
					}
					answer = answer.concat("1");
					break;
				case 'B':
					input = input.substring(1);
					if(answer.length() > 0){
						answer = answer.substring(0, answer.length()-1);
					}
					break;
			}
		}
		
		System.out.println(answer);
		
	}
}