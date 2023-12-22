import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int result = 0;
		int currentWhite = 0;
		for (int i = 0; i < input.length(); i++) {
		    char color = input.charAt(i);
		    if (color == 'W') {
		        result += (i - currentWhite);
		        currentWhite++;
		    }
		}
		System.out.println(result);
    }
}