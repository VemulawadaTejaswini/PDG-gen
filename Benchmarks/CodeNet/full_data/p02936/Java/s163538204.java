import java.util.*;

public class Main {

    static int[] score;
    static HashMap<Integer, List<Integer>> tree;

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        tree = new HashMap<>();

        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(!tree.containsKey(a)) {
                List<Integer> hoge = new ArrayList<>();
                hoge.add(b);
                tree.put(a, hoge);
            } else {
                List<Integer> tmp = tree.get(a);
                tmp.add(b);
                tree.put(a, tmp);
            }
        }
        score = new int[n];

        for (int i = 0; i < q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            addScore(p, x);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(score[i] + " ");
        }
        System.out.println();

    }

    static void addScore(int root, int x) {
        score[root-1] += x;
        if(tree.containsKey(root)) {
            List<Integer> tmp = tree.get(root);
            for (int j = 0; j < tmp.size(); j++) {
                addScore(tmp.get(j), x);
            }
        }
    }

}
