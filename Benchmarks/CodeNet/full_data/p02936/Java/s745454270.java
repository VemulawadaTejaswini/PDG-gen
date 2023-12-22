import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        List<Node> nodeList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            nodeList.add(new Main.Node());
        }

        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodeList.get(a - 1).addChildren(nodeList.get(b - 1));
        }

        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            nodeList.get(p - 1).addCount(x);
        }

        String ans = "" + nodeList.get(0).getCount();
        for (int i = 1; i < N; i++) {
            ans += " " + nodeList.get(i).getCount();
        }
        System.out.println(ans);

    }

    static class Node {

        private List<Node> children;
        private int count;

        public Node() {
            count = 0;
            children = new ArrayList<>();
        }

        public List<Node> getChildren() {
            return children;
        }

        public void addChildren(Node children) {
            this.children.add(children);
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public void addCount(int n) {
            for(Node chirdren: children){
                chirdren.addCount(n);
            }
            count += n;
        }

    }
}