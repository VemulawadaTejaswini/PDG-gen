import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split("/", 3);

        int y = Integer.valueOf(s[0]);
        int m = Integer.valueOf(s[1]);
        int d = Integer.valueOf(s[2]);

        boolean ans = false;
        if (y > 2019)
            ans = true;
        else {
            if (y == 2019) {
                if (m > 4)
                    ans = true;
            }
        }
        System.out.println(ans ? "TBD" : "Heisei");
    }
}
