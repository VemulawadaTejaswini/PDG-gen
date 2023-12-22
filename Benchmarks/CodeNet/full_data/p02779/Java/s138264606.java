
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String result = "YES";
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String A = sc.next();
            if (set.contains(A)) {
                result = "NO";
                break;
            }
            set.add(A);
        }

        System.out.println(result);

        sc.close();
    }

}
