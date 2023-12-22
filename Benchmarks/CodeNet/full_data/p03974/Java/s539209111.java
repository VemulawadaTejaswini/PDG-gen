
import java.util.*;

/**
 * Created by ml_qi on 2016/9/20.
 */
public class Main {

    class Node {
        Node[] child;
        int cnt = 0;
        boolean isWord = false;
        Node(){this.child = new Node[26];}
    }

    public void insert(Node root, String s, int idx) {
        root.cnt++;
        if (idx < s.length()) {
            if (root.child[s.charAt(idx) - 'a'] == null) {
                root.child[s.charAt(idx) - 'a'] = new Node();
            }
            insert(root.child[s.charAt(idx) - 'a'], s, idx+1);
        } else {
            root.isWord = true;
        }
    }

    public int get(Node root, String s, int idx, String order) {
        if (idx < s.length()) {
            int cum = 0;
            int tmp = 0;
            while (order.charAt(tmp) != s.charAt(idx)) {
                cum = root.child[order.charAt(tmp) - 'a'] == null ? cum : cum + root.child[order.charAt(tmp) - 'a'].cnt;
                tmp++;
            }
            if (root.child[s.charAt(idx) - 'a'].isWord) {
                cum++;
            }
            return cum + get(root.child[s.charAt(idx) - 'a'], s,  idx + 1, order);
        } else {
            return 0;
        }
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Node root = new Node();
        String[] dict = new String[n];
        for (int i = 0; i < n; i++) {
            dict[i] = in.nextLine();
            insert(root, dict[i], 0);
        }

        int m = in.nextInt();
        in.nextLine();
        for (int i = 0; i < m; i++) {
            String s = in.nextLine();
            int p = Integer.parseInt(s.split(" ")[0]);
            s = s.split(" ")[1];
            int result = get(root, dict[i], 0, s);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }


}
