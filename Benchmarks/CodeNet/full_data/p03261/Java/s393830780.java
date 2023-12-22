import java.util.*;
import java.math.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        String[] W = new String[N];
        for (int i = 0; i < N; i++) W[i] = sc.nextLine();

        List<String> history = new ArrayList<>();
        for (int i = 0; i < W.length; i++) {
            String word = W[i];

            if (history.contains(word) || (i != 0 && history.get(i - 1))) {
                System.out.println("No");
                return;
            }

            history.add(word);
        }
        
        System.out.println("Yes");
    }

}