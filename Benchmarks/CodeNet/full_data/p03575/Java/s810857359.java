import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    /**
     * 本処理を実行します。
     */
    public static void execute() {
        Scanner sc = new Scanner(System.in);

        int n = nextInt(sc);
        int m = nextInt(sc);

        // NodeList
        List<Node> nodeList = new ArrayList<>(n);

        // Array
        int[][] field = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(field[i], 0);
        }

        for (int i = 0; i < m; i++) {
            int a = nextInt(sc);
            int b = nextInt(sc);

            // Array
            field[a - 1][b - 1]++;
            field[b - 1][a - 1]++;

            // NodeList
            Node aNode = new Node(a);
            Node bNode = new Node(b);

            if (nodeList.contains(aNode)) {
                aNode = nodeList.get(nodeList.indexOf(aNode));
            } else {
                nodeList.add(aNode);
            }

            if (nodeList.contains(bNode)) {
                bNode = nodeList.get(nodeList.indexOf(bNode));
            } else {
                nodeList.add(bNode);
            }

            aNode.linkNodes.add(bNode);
            bNode.linkNodes.add(aNode);
        }

        List<Node> oneLinkNodeList = nodeList.parallelStream().filter(no -> no.linkNodes.size() == 1).collect(Collectors.toList());

        int result = oneLinkNodeList.size();

        for (Node oneLinkNode : oneLinkNodeList) {
            for (Node node : oneLinkNode.linkNodes) {
                node.checkedNode.add(oneLinkNode);
                oneLinkNode.checkedNode.add(node);

                result += node.getNodeCount();
            }
        }

        // Array
        /*int result = 0;
        int[] outNode = new int[n];
        int out = 0;

        for (int i = 0; i < n; i++) {
            if (field[i].length == 1) {
                outNode[out++] = i;

                for (int j = 0; j < n; j++) {

                }
            }
        }

        out (result / 2);*/

        out(result);
    }

    public static class Node {
        int num;
        List<Node> linkNodes = new ArrayList<>();
        List<Node> checkedNode = new ArrayList<>();

        public Node(int num) {
            this.num = num;
        }

        public int getNodeCount() {
            int count = 0;
            List<Node> parents = new ArrayList<>();
            parents.add(this);

            for (Node n : linkNodes) {
                if (!checkedNode.contains(n) ) {

                    checkedNode.add(n);
                    n.checkedNode.add(this);

                    if (n.linkNodes.size() == 2) {
                        count++;
                    }

                    count += n.getNodeCount(parents);
                }
            }

            return count;
        }

        public int getNodeCount(List<Node> parentNodes) {
            int count = 0;
            parentNodes.add(this);

            for (Node n : linkNodes) {
                if (!parentNodes.contains(n) && !checkedNode.contains(n) ) {

                    checkedNode.add(n);
                    n.checkedNode.add(this);

                    if (n.linkNodes.size() == 2) {
                        count++;
                    }

                    count += n.getNodeCount(parentNodes);
                }

            }

            return count;
        }

        /* (非 Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + num;
            return result;
        }

        /* (非 Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Node other = (Node) obj;
            if (num != other.num)
                return false;
            return true;
        }

        /* (非 Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString() {
            return "Node [num=" + num + "]";
        }
    }
    /**
     * 次の標準入力をintで受け取ります。
     * @return 標準入力値(int)
     */
    public static int nextInt(Scanner sc) {
        return sc.nextInt();
    }

    /**
     * 次の標準入力をStringで受け取ります。
     * @return 標準入力値(String)
     */
    public static String nextString(Scanner sc) {
        return sc.next();
    }

    /**
     * 次の標準入力を指定回数分intで受け取ります。
     * @param n 取得回数
     * @return 取得した標準入力値の配列(int)
     */
    public static int[] nextInts(Scanner sc, int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nextInt(sc);
        }

        return arr;
    }

    /**
     * 標準出力にオブジェクトを出力します。
     * @param o 出力対象
     */
    public static void out(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        execute();
    }


    public static void putCountMap(Map<Integer, Integer> map, int value) {
        if (map.containsKey(value)) {
            map.put(value, map.get(value) + 1);
        } else {
            map.put(value, 1);
        }
    }
}
