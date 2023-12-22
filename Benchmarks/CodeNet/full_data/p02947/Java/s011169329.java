import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String[] s = new String[N];
        for (int i = 0; i < N; i++) {
            char[] c = sc.next().toCharArray();
            Arrays.sort(c);
            s[i] = String.valueOf(c);
        }

        long res = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (s[i].equals(s[j])) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
