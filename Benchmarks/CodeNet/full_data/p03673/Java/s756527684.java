
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String b = "";
        StringBuilder sb = new StringBuilder(b);

        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String ss[] = s.split(" ");
        do {
            sb.reverse().trimToSize();
            sb.append(" ");

            sb.append(ss[i]).trimToSize();
            i++;

        } while (i < ss.length);
        String sy[] = sb.toString().split("  ");
        System.out.println(sy[0]+" "+sy[1]);

    }
}
