import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int[] c = new int[26];
            for (int j = 0; j < s.length(); j++) {
                c[s.charAt(j) - 'a'] += 1;
            }
            list.add(c);
        }
        int[] s1 = list.get(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < list.size(); i++) {
            int[] s = list.get(i);
            for (int j = 0; j < s.length; j++) {
                s1[j] = Math.min(s1[j], s[j]);
            }
        }
        for (int i = 0; i < s1.length; i++) {
            int num = s1[i];
            for (int j = 0; j < num; j++) {
                sb.append(Character.toChars(i + 'a'));
            }
        }
        System.out.println(sb.toString());
    }
}