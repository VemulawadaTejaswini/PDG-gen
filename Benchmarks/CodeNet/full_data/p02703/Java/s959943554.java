
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

class City {
    long c;
    long d;
    City(long c, long d) {
        this.c = c;
        this.d = d;
    }
}
class CityCost implements Comparable<CityCost> {
    int cityIndex;
    long cost;
    int silver;
    CityCost(int cityIndex, int silver, long cost) {
        this.cityIndex = cityIndex;
        this.cost = cost;
        this.silver = silver;
    }

    @Override
    public int compareTo(CityCost o) {
        return Long.compare(cost, o.cost);
    }
}
class Edge {
    int a;
    long b;
    Edge(int a, long b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return a == edge.a &&
                b == edge.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long s = scanner.nextLong();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        int[][] edgeIndex = new int[n + 1][n + 1];
        Edge[] edges = new Edge[m + 1];
        City[] cities = new City[n + 1];
        int maxA = 0;
        for (int i = 1; i <= m; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int a = scanner.nextInt();
            long b = scanner.nextLong();
            maxA += a;
            edgeIndex[u][v] = i;
            edgeIndex[v][u] = i;
            Edge edge = new Edge(a, b);
            edges[i] = edge;
            Set<Integer> uNext = graph.getOrDefault(u, new HashSet<>());
            uNext.add(v);
            graph.put(u, uNext);
            Set<Integer> vNext = graph.getOrDefault(v, new HashSet<>());
            vNext.add(u);
            graph.put(v, vNext);
        }
        for (int i = 1; i <= n; ++i) {
            long c = scanner.nextLong();
            long d = scanner.nextLong();
            City city = new City(c, d);
            cities[i] = city;
        }
        int maxSilvers = maxA;
        long [][] times = new long[n + 1][maxSilvers + 1];
        for (int i = 1; i <= n; ++i) {
            for (int silver = 0; silver <= maxSilvers; ++silver) {
                times[i][silver] = Long.MAX_VALUE;
            }
        }
        int startCoin = s < maxSilvers ? (int)s : maxSilvers;
        times[1][startCoin] = 0;
        Queue<CityCost> queue = new PriorityQueue<>(n * maxA);
        queue.add(new CityCost(1, startCoin, 0));
        if (startCoin < maxSilvers) {
            long cost = cities[1].d;
            long addedSilver = cities[1].c;
            while (true) {
                long silver = startCoin + addedSilver;
                if (silver > maxSilvers) {
                    times[1][maxSilvers] = cost;
                    queue.add(new CityCost(1, maxSilvers, cost));
                    break;
                }
                times[1][(int)silver] = cost;
                queue.add(new CityCost(1, (int)silver, cost));
                cost += cities[1].d;
                addedSilver += cities[1].c;
            }
        }
        Set<Integer> visited = new HashSet<>();
        visited.add(1);
        while (!queue.isEmpty()) {
            CityCost cityCost = queue.poll();
            int currentIndex = cityCost.cityIndex;
            if (cityCost.cost > times[currentIndex][cityCost.silver]) {
                continue;
            }
            visited.add(currentIndex);
            if (visited.size() == n) {
                break;
            }
            for (int silver = 0; silver <= maxSilvers; ++silver) {
                if (times[currentIndex][silver] == Long.MAX_VALUE) {
                    continue;
                }
                for (int next : graph.get(currentIndex)) {
                    int edge = edgeIndex[currentIndex][next];
                    int a = edges[edge].a;
                    long b = edges[edge].b;
                    long c = cities[currentIndex].c;
                    long d = cities[currentIndex].d;
                    long exchangeCoins =
                            silver < a
                                    ? (a - silver) / c + ((a - silver) % c > 0 ? 1 : 0)
                                    : 0;
              //      System.out.println("exchangeCoins: " + exchangeCoins);
                    long remainSilver = silver + exchangeCoins * c - a;
                    int realRemainSilver = remainSilver > maxSilvers ? maxSilvers : (int)remainSilver;
                    long cost = times[currentIndex][silver] + exchangeCoins * d + b;

                    if (times[next][realRemainSilver] > cost) {
                        times[next][realRemainSilver] = cost;
                        queue.add(new CityCost(next, realRemainSilver, cost));
                    }
                //    System.out.println("realRemainSilver: "+ realRemainSilver + " cost: " + cost);
               //     System.out.println("times[" + next + "][" + realRemainSilver + "]: " + times[next][realRemainSilver]);

                    while (realRemainSilver < maxSilvers) {
                        int nextRealRemainCoin = realRemainSilver + c > maxSilvers ?
                                maxSilvers : (int)(realRemainSilver + c);
                        if (times[next][nextRealRemainCoin] > cost + d) {
                            times[next][nextRealRemainCoin] = cost + d;
                            queue.add(new CityCost(next, nextRealRemainCoin, times[next][nextRealRemainCoin]));
                        }
                        realRemainSilver = nextRealRemainCoin;
                   //     System.out.println("cost: " + cost + " d:  " + d);
                  //      System.out.println("times[" + next + "][" + nextRealRemainCoin + "]: " + times[next][nextRealRemainCoin]);
                        d += cities[currentIndex].d;
                    }
                }
            }
        }
        for (int i = 2; i <= n; ++i) {
            long min = Long.MAX_VALUE;
            for (int silver = 0; silver <= maxSilvers; ++silver) {
                if (times[i][silver] != Long.MAX_VALUE) {
                    min = Math.min(min, times[i][silver]);
                }
            }
            System.out.println(min);
        }

    }
}
