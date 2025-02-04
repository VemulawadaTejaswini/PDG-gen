import java.util.*;

// UVa 11504

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[] c = in.next().toCharArray();
		
		int index = 0;
		char[] answer = new char[10];
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '0' || c[i] == '1') {
				answer[index] = c[i];
				index++;
			} else if (index > 0) {
				index--;
			}
		}
		
		for (int i = 0; i <= index; i++) {
			System.out.printf("%c", answer[i]);
		}
	}
}