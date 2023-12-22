
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        final BiFunction<Integer, Integer, Boolean> isTree = (nodes, edges) -> edges == nodes - 1;
        if (isTree.apply(n, m)) {
            System.out.println(0);
            return;
        }

        final List<Long> costs = IntStream.range(0, n)
            .mapToObj(i -> scanner.nextLong())
            .collect(Collectors.toList());

        final UnionFindTree unionFindTree = new UnionFindTree(n);
        for (int i = 0; i < m; i++) {
            unionFindTree.unit(scanner.nextInt(), scanner.nextInt());
        }

        final List<Tree> trees = IntStream.range(0, n)
            .boxed()
            .collect(Collectors.groupingBy(unionFindTree::getRoot))
            .entrySet().stream()
            .map(entry -> new Tree(entry.getKey(), entry.getValue().stream().map(costs::get).collect(Collectors.toList())))
            .collect(Collectors.toList());

        final PriorityQueue<Tree> queue = new PriorityQueue<>(Comparator.comparingLong(tree -> tree.queue.peek()));
        queue.addAll(trees);
        final UnionFindTree unionFindTree2 = new UnionFindTree(n);
        long sum = 0;
        for (int i = 0; i < trees.size() - 1; i++) {
            final Tree poll = queue.poll();
            final List<Tree> tmp = new ArrayList<>();
            while (!queue.isEmpty()) {
                final Tree current = queue.poll();
                if (!unionFindTree2.isSame(poll.id, current.id)) {
                    sum += poll.queue.poll() + current.queue.poll();
                    break;
                } else {
                    tmp.add(current);
                }
            }

            if (queue.isEmpty()) {
                System.out.println("Impossible");
                return;
            }

            queue.addAll(tmp);
            if (!poll.queue.isEmpty()) {
                queue.add(poll);
            }
        }

        System.out.println(sum);
    }

    private static class Tree {
        final int id;
        final PriorityQueue<Long> queue;

        Tree(final int id, final List<Long> list) {
            this.id = id;
            this.queue = new PriorityQueue<>(list);
        }
    }

    private static class UnionFindTree {
        private final Integer[] nodes;
        private final List<Integer> indices = new ArrayList<>();

        UnionFindTree(final int numOfNodes) {
            this.nodes = init(numOfNodes);
        }

        private Integer[] init(final int numOfNodes) {
            return IntStream.range(0, numOfNodes)
                .boxed()
                .toArray(Integer[]::new);
        }

        /**
         * 引数のノードが属している木の根を返す．
         *
         * @param nodeNumber ノードの番号
         * @return 根，つまり属している集合の中の一番小さい値
         */
        int getRoot(final int nodeNumber) {
            final int rootNode = nodes[nodeNumber];
            if (rootNode == nodeNumber) {
                for (final Integer index : indices) {
                    nodes[index] = rootNode;
                }
                indices.clear();
                return nodeNumber;
            }

            indices.add(nodeNumber);
            return getRoot(rootNode);
        }

        /**
         * 二つのノードが同じ集合に属しているかを判定する．
         *
         * @param nodeA ノード
         * @param nodeB ノード
         * @return 二つのノードが同じ集合に属しているかの判定結果
         */
        boolean isSame(final int nodeA, final int nodeB) {
            return getRoot(nodeA) == getRoot(nodeB);
        }

        /**
         * 引数のノードが属する集合を合体させる．
         *
         * @param nodeA ノード
         * @param nodeB ノード
         */
        void unit(final int nodeA, final int nodeB) {
            final int rootA = getRoot(nodeA);
            final int rootB = getRoot(nodeB);

            if (rootA == rootB) {
                return;
            }

            nodes[Math.max(rootA, rootB)] = Math.min(rootA, rootB);
        }
    }

    private static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(final InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
