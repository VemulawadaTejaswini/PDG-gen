import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '9') {
                sb.append('1');
            } else if (ch[i] == '1') {
                sb.append('9');
            }
        }
        System.out.println(sb.toString());
    }
}