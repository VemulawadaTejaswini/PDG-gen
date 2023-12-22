import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static Integer INVALID = 1000000001;

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        long L = scan.nextLong();
        Node[] nodeList = new Node[N];
        for (int i = 0; i < N; i++) {
            nodeList[i] = new Node(i);
        }
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            long c = scan.nextLong();
            if(c > L)
                continue;

            nodeList[a].nodeCost.put(b, c);
            nodeList[b].nodeCost.put(a, c);
        }

        long[][] d = new long[N][N];
        for (int i = 0; i < N; i++)
            Arrays.fill(d[i], -1);

        for (int i = 0; i < N; i++) {
            for (Node node : nodeList) {
                node.isDetermined = false;
                node.remainedOil = INVALID;
                node.suppliedTime = 0;
            }

            nodeList[i].remainedOil = L;

            getSuppliedTime(i, N, nodeList, L, d);
        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int start = scan.nextInt() - 1;
            int end = scan.nextInt() - 1;

            os.println(d[start][end]);

        }
    }

    private static class Node implements Comparable{
        // このノードから伸びるエッジの情報
        int number = 0;//自分のノード番号
        HashMap<Integer, Long> nodeCost = new HashMap<>();//接続先のノード番号とコスト
        boolean isDetermined = false;
        long remainedOil = 0;
        long suppliedTime = 0;

        public Node (int nodeNum) {
            number = nodeNum;
        }


        @Override
        public int compareTo(Object o) {
            Node sub = (Node) o;
            if(this.suppliedTime < sub.suppliedTime)
                return -1;
            else if (this.suppliedTime == sub.suppliedTime) {
                if(this.remainedOil > sub.remainedOil)
                    return -1;
                else if(this.remainedOil < sub.remainedOil)
                    return 1;
                else
                    return 0;
            } else {
                return 1;
            }
        }
    }

    private static void getSuppliedTime(int start, int end, Node[] nodeList, long oilCapa, long[][] d) {

        PriorityQueue<Node> nextQue = new PriorityQueue<>();

        nextQue.add(nodeList[start]);

        while(!nextQue.isEmpty()) {

            Node node = nextQue.poll();
            node.isDetermined = true;
            d[start][node.number] = node.suppliedTime;
//            if (node.number == end)
//                break;

            for (Entry<Integer, Long> entry : node.nodeCost.entrySet()) {
                Node edge = nodeList[entry.getKey()];
                Long cost = entry.getValue();
                if(!edge.isDetermined) {

                    //給油の要否
                    long remainedOil;
                    long suppliedTime;
                    if(node.remainedOil >= cost){
                        remainedOil = node.remainedOil - cost;
                        suppliedTime = node.suppliedTime;
                    } else {
                        remainedOil = oilCapa - cost;
                        suppliedTime = node.suppliedTime + 1;
                    }

                    boolean isUpdated = false;
                    if(edge.remainedOil != INVALID) {
                        if(edge.suppliedTime == suppliedTime) {
                            if(edge.remainedOil < remainedOil) {
                                edge.remainedOil = remainedOil;
                                isUpdated = true;
                            }
                        } else if (edge.suppliedTime > suppliedTime) {
                            edge.suppliedTime = suppliedTime;
                            edge.remainedOil = remainedOil;
                            isUpdated = true;
                        }
                    } else {
                        edge.remainedOil = remainedOil;
                        edge.suppliedTime = suppliedTime;
                        isUpdated = true;
                    }

                    if(isUpdated)
                        nextQue.offer(edge);
                }
            }
        }

//        Node endNode = nodeList[end];
//
//
//        if(endNode.isDetermined) {
//            return endNode.suppliedTime;
//        } else {
//            return -1;
//        }
    }


    private static class Scanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        private Scanner(InputStream is) {
            this.reader = new BufferedReader(new InputStreamReader(is), 1 << 15);
        }

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        char[][] nextCharArray(int n, int m) {
            char[][] a = new char[n][m];
            for (int i = 0; i < n; i++) {
                a[i] = next().toCharArray();
            }
            return a;
        }

        int[] nextIntArray(int n, java.util.function.IntUnaryOperator op) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = op.applyAsInt(nextInt());
            }
            return a;
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        long[] nextLongArray(int n, java.util.function.LongUnaryOperator op) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = op.applyAsLong(nextLong());
            }
            return a;
        }
    }
}
