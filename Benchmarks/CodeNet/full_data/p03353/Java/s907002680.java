import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int K = scanner.nextInt();
        SortedSet<String> ss = new TreeSet<>();
        int len = s.length();
        for(int i = 0; i < len; i++ ) {
            for(int j = i + 1; j <= i + 5 && j <= len; j++){
                String x = s.substring(i,j);
                ss.add(x);
            }
        }

        String[] result = ss.toArray(new String[ss.size()]);
        System.out.println(result[K - 1]);
    }
}
