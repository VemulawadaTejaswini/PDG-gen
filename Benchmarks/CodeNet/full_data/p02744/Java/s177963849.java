import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<String> str = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        partition(n);
        for (String s : str) {
            String[] strings = s.split(" ");
            StringBuilder stringBuilder = new StringBuilder(n);
            char c = 'a';
            for (int i = 0; i < strings.length; i++) {
                if(strings[i].isEmpty()) continue;
                int i1 = Integer.parseInt(strings[i]);
                for (int j = 0; j < i1; j++) {
                    stringBuilder.append(c);
                }
                c++;
            }
            System.out.println(stringBuilder.toString());
        }
    }

    public static void partition(int n) {
        partition(n, n, "");
    }
    public static void partition(int n, int max, String prefix) {
        if (n == 0) {
           str.add(prefix);
            return;
        }

        for (int i = Math.min(max, n); i >= 1; i--) {
            partition(n-i, i, prefix + " " + i);
        }
    }
}