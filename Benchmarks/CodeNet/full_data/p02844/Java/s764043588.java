import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = sc.next().split("");
        Set<String> list = new HashSet<>();

        StringBuilder builder;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    builder = new StringBuilder();
                    builder.append(s[i]).append(s[j]).append(s[k]);
                    list.add(builder.toString());
                }
            }
        }

        System.out.println(list.size());
    }
}