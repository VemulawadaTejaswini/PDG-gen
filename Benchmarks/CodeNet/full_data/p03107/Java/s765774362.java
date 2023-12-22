import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count0 = 0;        
        int count1 = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') ++count0;
            if (c == '1') ++count1;
        }
        
        int min = Math.min(count0, count1);
        System.out.println(min * 2);
    }
}
