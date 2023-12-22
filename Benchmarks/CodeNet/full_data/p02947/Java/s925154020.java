import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        long count = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            String countStr = mkString(str);
            map.put(countStr, map.getOrDefault(countStr, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int num = entry.getValue();
            count += nC2(num);
        }
        System.out.println(count);
    }

    public static String mkString(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(count[i]);
            char c = (char)(i + 'a');
            sb.append(String.valueOf(c));
        }
        return sb.toString();
    }
    public static long nC2(int num) {
        if (num == 0 || num == 1) return 0;
        return (long)num * (num - 1) / 2;
    }
}
