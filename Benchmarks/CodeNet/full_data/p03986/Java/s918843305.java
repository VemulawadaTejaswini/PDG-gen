
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int s = 0;
        int t = 0;
        int count = 0;
        for (int i = 0 ; i < S.length() ; i++) {
            if (S.substring(i, i + 1).equals("S")) {
                s++;
            } else {
                t++;
                if (t > s) {
                    count++;
                }
            }
        }
        System.out.println(2 * count);
    }

}