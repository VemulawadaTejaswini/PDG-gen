import java.util.*;

public class main {
	public static void main(string args[]) {
    	Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
      	for (char c : s.toCharArray()) {
        	if (c == '7') {
            	System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}