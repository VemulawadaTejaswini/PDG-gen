import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        String s = sn.next();
        
        int diff = 0;
        int result = 0;
        
        do {
            String sBefore = s;
            s = s.replaceAll("01", "");
            s = s.replaceAll("10", "");
            diff = sBefore.length() - s.length();
            result += diff;
        } while (diff >= 1);
        
        System.out.println(result);
    }
}