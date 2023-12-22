import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] input_chars = input.toCharArray();

		int count = 0;
		int len = input_chars.length;
		for(int i =0; i <len/2; i++){
			if(input_chars[i] != input_chars[len-1-i]){
				count++;
			}
		}

		System.out.print(count);
	}
}
