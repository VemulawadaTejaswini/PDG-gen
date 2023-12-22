
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        s = s.replaceAll("dreamer", "-");
        s = s.replaceAll("eraser", "-");
        s = s.replaceAll("dream", "-");
        s = s.replaceAll("erase", "-");

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-') {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");

    }
}
