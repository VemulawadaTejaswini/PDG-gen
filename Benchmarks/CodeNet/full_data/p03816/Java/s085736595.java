import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Set<Integer> A = new HashSet<Integer>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        int ans = (A.size() % 2 != 0)? A.size(): A.size() - 1;
        System.out.println(ans);
    }

}
