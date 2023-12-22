import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String input = sc.next();
		
		for(int i = 0; i < input.length(); i++) {
			int tmp = (input.charAt(i) + num);
			
			if(tmp > 'Z')
				tmp = tmp - 'Z' + 'A' -1;
			System.out.print((char)(tmp));
		}
	}
}