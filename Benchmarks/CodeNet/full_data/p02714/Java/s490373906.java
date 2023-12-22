import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var n = sc.nextInt();
        var s = sc.next().toCharArray();

        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (s[i] != s[j] && s[j] != s[k] && s[k] != s[i] && j - i != k - j) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
