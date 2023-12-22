import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();
        String prev = sc.next();
        boolean isOk = true;
        for (int i = 1; i < n; i++) {
            set.add(prev);
            String current = sc.next();
            if (set.contains(current) || prev.charAt(prev.length() - 1) != current.charAt(0)) {
                isOk = false;
                break;
            }
            prev = current;
        }

        if (isOk) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }

}
