import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int length = 100;
		StringBuilder sb = new StringBuilder();
		sb.append(length).append(" ").append(length).append("\n");
		for (int i = 0; i < length / 2; i++) {
		    char[] line = new char[length];
		    Arrays.fill(line, '#');
		    if (i % 2 == 0) {
		        for (int j = 0; j < length && a > 1; j++) {
		            if (j % 2 == 0) {
		                line[j] = '.';
    		            a--;
		            }
		        }
		    }
		    sb.append(new String(line)).append("\n");
		}
		for (int i =  length / 2; i < length; i++) {
		    char[] line = new char[length];
		    Arrays.fill(line, '.');
		    if (i % 2 == 1) {
		        for (int j = 0; j < length && b > 1; j++) {
		            if (j % 2 == 0) {
		                line[j] = '#';
    		            b--;
		            }
		        }
		    }
		    sb.append(new String(line)).append("\n");
		}
		System.out.print(sb);
    }
}

