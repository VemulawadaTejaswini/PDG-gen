import java.util.Scanner;
import java.lang.Character;

public class Main {
	public static void main (String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
        	int n = sc.nextInt();
          	int k = sc.nextInt();
          	String s = sc.next();
          	String res = "";
          	for (int i = 0; i < n; i++) {
            	if (i == k - 1) {
                	char ch = Character.toLowerCase(s.charAt(i));
                  	res += " " + ch;
                }
              res += " "+s.charAt(i);
            }
          System.out.println(res);
        }
	}
}
