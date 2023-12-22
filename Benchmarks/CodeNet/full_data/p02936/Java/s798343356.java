import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        List<Node> nodeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodeList.add(new Node());
        }

        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            nodeList.get(a).addChild(nodeList.get(b));
        }

        for (int i = 0; i < q; i++) {
            int p = sc.nextInt()-1;
            int x = sc.nextInt();

            nodeList.get(p).addCnt(x);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nodeList.get(i).cnt + " ");
        }
    }

    static class Node {
        int cnt;
        List<Node> childNodeNum;

        Node() {
            childNodeNum = new ArrayList<>();
        }

        void addChild(Node child) {
            childNodeNum.add(child);
        }

        void addCnt(int cnt) {
            this.cnt += cnt;
            for (int i = 0; i < childNodeNum.size(); i++) {
                childNodeNum.get(i).addCnt(cnt);
            }
        }
    }
}