import java.util.*;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
        boolean isOK = true;

        for (int i = 1; i <= s.length(); i++) {
            char c = s.charAt(i-1);
            if (i % 2 == 0) {
                if (c != 'L' && c != 'U' && c != 'D'){
                    isOK = false;
                    break;
                }
            } else {
                if (c != 'R' && c != 'U' && c != 'D'){
                    isOK = false;
                    break;
                }
            }
        }
        if (isOK)
            System.out.println("Yes");
        else 
            System.out.println("No");
   	}
}