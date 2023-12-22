import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char [ ] str = sc.next().toCharArray();
		
		/* debug
		System.out.println(N);
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		*/
		
		for(int i = 0; i < N-2; i++) {
			//System.out.println(String.format("%c%c%c", str[i], str[i+1], str[i+2]));
			if(String.format("%c%c%c", str[i], str[i+1], str[i+2]).equals("ABC")) {
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
