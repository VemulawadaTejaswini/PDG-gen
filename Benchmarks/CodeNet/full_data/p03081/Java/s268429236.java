import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        char[] t = new char[q];
        char[] d = new char[q];
        for (int i = 0; i < q; i++) {
            t[i] = sc.next().charAt(0);
            d[i] = sc.next().charAt(0);
        }

        HashMap<Character, ArrayList<Node>> m = new HashMap<>();
        Node[] nodes = new Node[N];
        for (int i = 0; i < 26; i++) {
            m.put((char) ('A' + i), new ArrayList<Node>());
        }
        Node c = null;
        Node r = new Node(0, null, null, s.charAt(0), 1);

        for (int i = 0; i < N; i++) {
            nodes[i] = r;
            c = r;
            if (i != N - 1) {
                r = new Node(i + 1, c, null, s.charAt(i + 1), 1);
                c.r = r;
            }

            ArrayList<Node> ll = m.get(s.charAt(i));
            ll.add(c);
        }
        int count = 0;
        for (int i = 0; i < q; i++) {
            ArrayList<Node> L = m.get(t[i]);
            int tmp = L.size();
            int idx = 0;
            ArrayList<Node> l_n = new ArrayList<>();
            ArrayList<Integer> l_a = new ArrayList<>();
            for (int j = 0; j < tmp; j++) {
                Node n = L.get(idx);

                Node nex = null;
                if (d[i] == 'L') {
                    nex = n.l;
                } else {
                    nex = n.r;
                }
                if (nex == null) {
                    count += n.hav;
                } else {
                    l_n.add(nex);
                    l_a.add(n.hav);
                }
                n.hav = 0;
                L.remove(idx);
            }
            for (int j = 0; j < l_n.size(); j++) {
                Node nex = l_n.get(j);
                if (nex.hav == 0) {
                    m.get(nex.c).add(nex);
                }
                nex.hav += l_a.get(j);
            }

        }
        System.out.println(N - count);
    }

    static class Node {
        int id;
        Node l;
        Node r;

        char c;

        int hav;

        Node(int id, Node l, Node r, char c, int hav) {
            this.id = id;
            this.l = l;
            this.r = r;
            this.c = c;
            this.hav = hav;
        }

    }
}
