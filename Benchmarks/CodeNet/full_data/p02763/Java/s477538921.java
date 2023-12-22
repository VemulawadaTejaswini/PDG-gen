
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String S = scanner.next();
        int Q = scanner.nextInt();
        List<TreeSet<Integer>> maps = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            maps.add(new TreeSet<>());
        }
        StringBuilder sb = new StringBuilder(S);
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            maps.get(c - 'a').add(i);
        }

        for (int i = 0; i < Q; i++) {
            int type = scanner.nextInt();
            int left = scanner.nextInt() - 1;
            if (type == 1) {
                String right = scanner.next();
                int mapIndex = sb.charAt(left) - 'a';
                maps.get(mapIndex).remove(left);
                maps.get(right.charAt(0) - 'a').add(left);
            } else {
                int right = scanner.nextInt() - 1;
                int count = 0;
                for (int j = 0; j < 26; j++) {
                    TreeSet<Integer> set = maps.get(j);
                    Integer floor = set.floor(right);
                    if (floor != null && floor >= left) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
