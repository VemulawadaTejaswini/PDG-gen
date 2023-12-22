import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		char[] cha = str.toCharArray();
		int i = 0;

		for(char c : cha) {
			if(c=='-') {
				i--;
			}else {
				i++;
			}
		}
		System.out.println(i);


	}
}

