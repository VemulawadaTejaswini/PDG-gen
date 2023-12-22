import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * Created by darshan on 3/28/19.
 */
public class C061 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int numStations = Integer.parseInt(st.nextToken());
        int numLines = Integer.parseInt(st.nextToken());

        List<List<Edge>> edges = new ArrayList<>(numStations);
        List<Set<Integer>> visitedFrom = new ArrayList<>();
        for (int i = 0; i < numStations; i++) {
            edges.add(new ArrayList<>());
            visitedFrom.add(new HashSet<>());
        }
        int[] minCost = new int[numStations];
        Arrays.fill(minCost, Integer.MAX_VALUE);
        minCost[0] = 0;

        for (int i = 0; i < numLines; i++) {
            st = new StringTokenizer(br.readLine());
            int stationP = Integer.parseInt(st.nextToken()) - 1;
            int stationQ = Integer.parseInt(st.nextToken()) - 1;
            int company = Integer.parseInt(st.nextToken());
            edges.get(stationP).add(new Edge(stationQ, company));
            edges.get(stationQ).add(new Edge(stationP, company));
        }

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            int station = queue.poll();
            if (station == numStations - 1) {
                System.out.println(minCost[station]);
                return;
            }

            for (Edge edge : edges.get(station)) {
                int cost = minCost[station];
                if (!visitedFrom.get(station).contains(edge.company)) {
                    cost += 1;
                }
                if (minCost[edge.station] > cost) {
                    queue.add(edge.station);
                }
                if (minCost[edge.station] >= cost) {
                    minCost[edge.station] = cost;
                    visitedFrom.get(edge.station).add(edge.company);
                }
            }
        }

        System.out.println(-1);
    }

    private static class Edge {
        private int station;
        private int company;

        private Edge(int station, int company) {
            this.station = station;
            this.company = company;
        }
    }
}
