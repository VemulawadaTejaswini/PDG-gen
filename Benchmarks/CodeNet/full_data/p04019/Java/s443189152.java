import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		boolean n=false,w=false,s=false,e=false;

		for(char c:Main.s.next().toCharArray()) {
			switch (c) {
			case 'N':
				n=true;
				break;
			case 'W':
				w=true;
				break;
			case 'S':
				s=true;
				break;
			case 'E':
				e=true;
				break;
			}
		}

		System.out.println(n^s||w^e?"No":"Yes");
	}
}
