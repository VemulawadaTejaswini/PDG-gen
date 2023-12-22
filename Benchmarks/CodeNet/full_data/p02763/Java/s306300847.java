import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        TreeSet<Integer>[] positions = new TreeSet[26];
        for (int i = 0; i < 26; i++) {
            positions[i] = new TreeSet<>();
        }
        for (int i = 1; i <= n; i++) {
            positions[arr[i - 1] - 'a'].add(i);
        }
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int idx = sc.nextInt();
                int prev = arr[idx - 1] - 'a';
                positions[prev].remove(idx);
                char c = sc.next().charAt(0);
                positions[c - 'a'].add(idx);
                arr[idx - 1] = c;
            } else {
                int left = sc.nextInt();
                int right = sc.nextInt();
                int count = 0;
                for (TreeSet<Integer> set : positions) {
                    Integer x = set.ceiling(left);
                    if (x != null && x <= right) {
                        count++;
                    }
                }
                sb.append(count).append("\n");
            }
        }
		System.out.print(sb);
   }
    

}
