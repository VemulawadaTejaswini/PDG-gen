import java.util.Scanner;
import java.util.regex.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        String wr = sc.next();
        String w = sc.next();
        //分割
        String[] wr_list = wr.split("");
        String[] w_list = w.split("");

        for (int i = 0; i < wr.length(); i++) {
            if (wr_list[i].equals(w_list[i])) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
