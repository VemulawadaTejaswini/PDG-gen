import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        long[] x = new long[26];
        for (char c : new Scanner(System.in).next().toCharArray()) x[c - 'a']++;
        long ans = 1;
        for (int i = 0; i < 26; i++) for (int j = i + 1; j < 26; j++) ans += x[i] * x[j];
        System.out.println(ans);
    }
}