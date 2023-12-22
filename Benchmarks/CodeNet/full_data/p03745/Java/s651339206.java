import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int lastV = sc.nextInt();
        Boolean zoka = null;
        for (int i = 1; i < n; i++) {
            int now = sc.nextInt();
            if (zoka == null) {
                if (lastV > now) {
                    zoka = false;
                } else if (lastV < now) {
                    zoka = true;
                }
            } else {
                if ((zoka && now < lastV) || !zoka && now > lastV) {
                    count++;
                    zoka = null;
                }
            }
            lastV = now;
        }

        System.out.println(count);
    }
}
