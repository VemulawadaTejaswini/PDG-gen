import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mind = 0;
		String input = new String();
		input = sc.next();
		for(int i = 0; i < 4; i++) {
			if(String.valueOf(input.charAt(i)).equals("+"))
				mind = mind + 1;
			else
				mind = mind - 1;
		}
		System.out.println(mind);
	}
}
