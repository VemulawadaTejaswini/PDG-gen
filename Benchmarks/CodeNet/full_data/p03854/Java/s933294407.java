
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        s = s.replaceAll("dream", "-");
        s = s.replaceAll("dreamer", "-");
        s = s.replaceAll("erase", "-");
        s = s.replaceAll("eraser", "-");
        s = s.replaceAll("-", "");

        if (s.equals("")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
