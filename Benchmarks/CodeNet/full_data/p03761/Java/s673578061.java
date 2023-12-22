import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = scan.next();
            char[] data = s.toCharArray();
            int[] count = new int[26];
            for(char c : data) {
                count[c-97] += 1;
            }
            list.add(count);
        }
        int[] t = new int[26];
        Arrays.fill(t, 50);
        for (int i = 0; i < N; i++) {
            int[] c = list.get(i);
            for (int j = 0; j < 26; j++) {
                t[j] = Math.min(t[j], c[j]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (t[i] == 0) {
                continue;
            }
            for(int j = 0; j < t[i]; j++) {
                sb.append((char)(i + 97));
            }
        }
        System.out.println(sb.toString());
    }
}
