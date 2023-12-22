import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] s = new String[N];

        for (int i=0;i<N;i++) {
            String si = sc.next();
            char[] ci = si.toCharArray();
            Arrays.sort(ci);
            s[i] = String.valueOf(ci);
        }

        Arrays.sort(s);

        long ans = 0;
        int count = 1;
        String target = "";
        for (int i=0;i<N;i++) {
//            System.out.println("s[" + i + "]: " + s[i]);
//            System.out.println("ans: " + ans);
//            System.out.println("count: " + count);
//            System.out.println("target: " + target);
            if (target.equals(s[i])) {
                count++;
            } else {
                ans += (count * (count - 1)) / 2;
                count = 1;
                target = s[i];
            }
        }

        ans += count * (count - 1) / 2;

        System.out.println(ans);
    }
}
