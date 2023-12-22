import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		
		int k = sn.nextInt();
		int x = sn.nextInt();
		
		int min = x - (k -1);
		int max = x + (k -1);
		
		StringBuilder sb = new StringBuilder();
		for (int i = min; i <= max; i++) {
			sb.append(i);
			sb.append(" ");
		}
		
		System.out.println(sb.substring(0, sb.length() - 1));
	}
	
}
