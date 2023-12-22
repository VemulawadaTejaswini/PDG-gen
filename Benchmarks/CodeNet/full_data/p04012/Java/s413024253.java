
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        boolean flg = true;
        for (char c = 'a' ; c <= 'z' ; c++) {
            int count = 0;
            for (int j = 0 ; j < s.length ; j++) {
                if (s[j] == c) count++;
            }
            if (count % 2 == 1) {
                flg = false;
            }
        }
        System.out.println(flg ? "Yes" : "No");
    }

}
