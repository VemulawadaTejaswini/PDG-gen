
import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int min = -1;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A' && min == -1)min = i;
            if(s.charAt(i) == 'Z')max = i;
        }
        System.out.println(max - min + 1);
    }








}


