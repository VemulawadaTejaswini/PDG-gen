import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import sun.rmi.runtime.Log;

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
        ArrayList<Node> nodeList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nodeList.add(new Node(i));
        }
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            long c = scan.nextLong();
            if(c > L)
                continue;

            nodeList.get(a).nodeCost.put(b, c);
            nodeList.get(b).nodeCost.put(a, c);
        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int start = scan.nextInt() - 1;
            int end = scan.nextInt() - 1;

            for (Node node : nodeList) {
                node.isDetermined = false;
                node.remainedOil = INVALID;
                node.suppliedTime = 0;
            }

            nodeList.get(start).remainedOil = L;

            long answer = getSuppliedTime(start, end, nodeList, L);

            os.println(answer);

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

    private static long getSuppliedTime(int start, int end, ArrayList<Node> nodeList, long oilCapa) {

        PriorityQueue<Node> nextQue = new PriorityQueue<>();

        nextQue.add(nodeList.get(start));

        while(!nextQue.isEmpty()) {

            Node node = nextQue.poll();
            node.isDetermined = true;
            if (node.number == end)
                break;

            for (Entry<Integer, Long> entry : node.nodeCost.entrySet()) {
                Node edge = nodeList.get(entry.getKey());
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

        Node endNode = nodeList.get(end);


        if(endNode.isDetermined) {
            return endNode.suppliedTime;
        } else {
            return -1;
        }
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
