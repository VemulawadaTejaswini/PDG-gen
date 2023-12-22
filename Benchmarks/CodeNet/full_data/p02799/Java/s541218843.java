import java.util.*;

public class Main {
    public static final int MAX_WEIGHT = 1_000_000_000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] d = new int[n];
        HashMap<Integer,Integer>[] graph = new HashMap[n];
        for (int i = 0; i < n; i++) {
            d[i] = scanner.nextInt();
            graph[i] = new HashMap<>();
        }

        int u,v;
        for (int i = 0; i < m; i++) {
            u = scanner.nextInt();
            v = scanner.nextInt();
            graph[u-1].put(v-1, i);
            graph[v-1].put(u-1, i);
        }
        Pair<Boolean[], Integer[]> result = bichrome(graph, d, m);
        if(result!=null){
            Boolean[] colors = result.getFirst();
            for (int i = 0; i < n; i++) {
                System.out.print(colors[i]? "B" : "W");
            }
            System.out.println();
            for (int w : result.second) {
                System.out.println(w);
            }
        }else{
            System.out.println(-1);
        }
    }

    public static Pair<Boolean[], Integer[]> bichrome(HashMap<Integer, Integer>[] graph, int[] weights, int numM) {
        Boolean[] nodeColors = new Boolean[weights.length];
        Integer[] edgeWeights = new Integer[numM];

        int toColor = weights.length;

        // найдем все вершины с минимальным значением
        while (toColor!=0){
            Set<Integer> withMinWeightNodes = new HashSet<>();
            int minWeight = Integer.MAX_VALUE;
            withMinWeightNodes.add(0);
            for (int i = 0; i < weights.length; i++) {
                if(nodeColors[i]!=null){
                    continue;
                };
                if(weights[i]<minWeight){
                    withMinWeightNodes.clear();
                    minWeight = weights[i];
                }
                if(weights[i]==minWeight){
                    withMinWeightNodes.add(i);
                }
            }

            // проверяем, что withMinWeightNodes либо соединены друг с дургом, либо соединены с уже покрашенными вершинами
            for (Integer withMinWeightNode : withMinWeightNodes) {
                if(nodeColors[withMinWeightNode]!=null) continue;
                for (Map.Entry<Integer, Integer> entry : graph[withMinWeightNode].entrySet()) {
                    if(nodeColors[entry.getKey()]!=null){
                        nodeColors[withMinWeightNode] = !nodeColors[entry.getKey()];
                        edgeWeights[entry.getValue()] = minWeight;
                        toColor--;
                        break;
                    }else if(withMinWeightNodes.contains(entry.getKey())){
                        //нужно покрасить два
                        nodeColors[withMinWeightNode] = true;
                        nodeColors[entry.getKey()] = false;
                        edgeWeights[entry.getValue()] = minWeight;
                        toColor-=2;
                        break;
                    }
                }
                if(nodeColors[withMinWeightNode]==null){
                    return null;
                }
            }
        }
        for (int i = 0; i < edgeWeights.length; i++) {
            if(edgeWeights[i]==null) edgeWeights[i] = MAX_WEIGHT;
        }
        return new Pair<>(nodeColors, edgeWeights);
    }

    public static class Pair<A,B> {
        private A first;
        private B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return first.equals(pair.first) &&
                    second.equals(pair.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }

        public A getFirst() {
            return first;
        }

        public B getSecond() {
            return second;
        }
    }
}