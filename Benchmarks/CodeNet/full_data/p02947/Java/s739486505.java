import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            char[]ss = sc.next().toCharArray();
            Arrays.sort(ss);
            s[i] = new String(ss);
        }
        long ans = 0;
        for (int i = 0; i < n -1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(s[i].contains(s[j])) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}