import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for (char s : sc.next().toCharArray()) {
            if (s == '1') cnt++;
        }
        System.out.println(cnt);
    }

}
