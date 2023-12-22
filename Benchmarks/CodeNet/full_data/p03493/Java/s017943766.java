import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("");
        int cnt = 0;
        for (String tmp : n) {
            if (tmp.equals("1")) cnt++;
        }
        System.out.println(cnt);
    }
}
