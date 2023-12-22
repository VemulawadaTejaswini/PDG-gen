import java.util.*;

public class Main {

    public static int r, s, p;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        r = sc.nextInt();
        s = sc.nextInt();
        p = sc.nextInt();

        String t = sc.next();

        ArrayList<Character> charList = new ArrayList<Character>();

        for (int i = 0; i < t.length(); i++) {
            charList.add(t.charAt(i));
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {

            char opponent = t.charAt(i);

            if (i < k) {
                ans += calc(opponent);
                continue;
            }

            if (charList.get(i) == charList.get(i - k)) {

                charList.set(i, 'z');
                continue;
            }

            ans += calc(opponent);
        }

        System.out.println(ans);
        sc.close();
    }

    public static int calc(char opponent) {
        switch (opponent) {
        case 'r':
            return p;

        case 's':
            return r;

        case 'p':
            return s;
        }

        return 0;
    }
}