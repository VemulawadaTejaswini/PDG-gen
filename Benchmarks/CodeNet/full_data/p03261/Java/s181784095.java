import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (set.contains(str)) {
                System.out.println("No");
                return;
            } else {
                set.add(str);
            }
        }

        sc.close();

        String[] w = set.toArray(new String[0]);

        for (int i = 1; i < n; i++) {
            String a = w[i - 1].substring(w[i - 1].length() - 1);
            String b = w[i].substring(0, 1);
            if (!a.equals(b)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}