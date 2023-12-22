import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = sc.nextInt();

        StringBuilder ans = new StringBuilder(a);

        for (int i = 0; i < b; i++) {
            if (sc.nextInt() == 1) {
                ans.reverse();
            } else {
                if (sc.nextInt() == 1) {
                    ans.insert(0, sc.next());
                } else {
                    ans.append(sc.next());
                }
            }
        }

        System.out.println(ans);

    }

}


