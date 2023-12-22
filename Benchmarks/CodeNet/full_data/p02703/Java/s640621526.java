import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int cities = nextInt();
        int roads = nextInt();
        long silvers = nextInt();
        ArrayList<info> matrix [] = new ArrayList [cities+1];
        for (int x=0; x<=cities; x++) {
            matrix[x] = new ArrayList<info>();
        }
        for (int x=1; x<=roads; x++) {
            int one = nextInt();
            int two = nextInt();
            int cost = nextInt();
            int time = nextInt();
            matrix[one].add(new info(two, cost, time));
            matrix[two].add(new info(one, cost, time));
        }
        int [][] exchangeBooth = new int [cities+1][2];
        for (int x=1; x<=cities; x++) {
            exchangeBooth[x][0] = nextInt(); //rate
            exchangeBooth[x][1] = nextInt(); //time
        }
        long [] distance = dijkstra(matrix, exchangeBooth, cities, 1, silvers);
        for (int x=1; x<=cities; x++) {
            System.out.println(distance[x]);
        }
    }
    public static long [] dijkstra (ArrayList [] matrix, int [][] exchangeBooth, int vertices, int start, long silvers) {
        String number = "1";
        for (int x=0; x<100; x++) {
            number += "0";
        }
        BigInteger goldCoins = new BigInteger(number);
        PriorityQueue <info> queue = new PriorityQueue<info>();
        queue.add(new info (start, 0, 0));
        long [] distance = new long [vertices+1];
        long [] money = new long [vertices+1];
        for (int x=0; x<=vertices; x++) {
            if (x!=start)
                distance [x] = Integer.MAX_VALUE;
        }
        money[start] = silvers;
        while (!queue.isEmpty()) {
            info cur = queue.poll();
            for (int x=0; x<matrix[cur.end].size(); x++) {
                info now = (info) matrix[cur.end].get(x);
                long temp = distance[cur.end]+now.time;
                long differenceOfCost = now.cost - money[cur.end];
                long goldCoinsExchanged = (differenceOfCost+(differenceOfCost-1)) / exchangeBooth[cur.end][0];
                if (goldCoins.subtract(BigInteger.valueOf(goldCoinsExchanged)).compareTo(BigInteger.valueOf(0))>=0) {
                    long curMoney = money[cur.end]-now.cost;
                    if (differenceOfCost<0) {
                        temp += goldCoinsExchanged*exchangeBooth[cur.end][1];
                        goldCoins = goldCoins.subtract(BigInteger.valueOf(goldCoinsExchanged));
                        curMoney+=exchangeBooth[cur.end][0]*goldCoinsExchanged;
                    }
                    if (distance[now.end]>temp) {
                        distance[now.end]=temp;
                        money[now.end] = curMoney;
                        queue.add(now);
                    }
                }
            }
        }
        return distance;
    }
    
    static class info implements Comparable<info> {
        int end;
        int cost;
        int time;
        public info (int e, int c, int t) {
            end = e;
            cost = c;
            time = t;
        }
        public int compareTo(info a) {
            return this.time - a.time;
        }
    }
    
    
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}


