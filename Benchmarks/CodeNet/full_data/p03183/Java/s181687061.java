import java.util.*;
import java.io.*;
class Main {
    static class Triplet implements Comparable<Triplet> {
        int weight;
        int strength;
        long value;
        Triplet(int weight, int strength, long value) {
            this.weight = weight;
            this.strength = strength;
            this.value = value;
        }
        public int compareTo(Triplet other) {
            return this.weight+this.strength-other.weight-other.strength;
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weights = new int[n];
        int[] strengths = new int[n];
        long[] values = new long[n];
        Triplet[] triplets = new Triplet[n];
        int maxWeight = 0;
        for(int i = 0; i<n; i++) {
            weights[i] = sc.nextInt();
            strengths[i] = sc.nextInt();
            values[i] = sc.nextLong();
            triplets[i] = new Triplet(weights[i], strengths[i], values[i]);
            maxWeight = Math.max(maxWeight, weights[i]);
        }
        Arrays.sort(triplets);
        long[][] dp = new long[n+1][maxWeight+1];
        for(long[] i: dp)
            Arrays.fill(i, -1);
        dp[0][0] = 0;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<=maxWeight; j++) {
                if(dp[i][j]!=-1) {
                    dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j]);
                    if(triplets[i].strength>=j) {
                        int currWeight = Math.min(triplets[i].weight + j, maxWeight);
                            dp[i+1][currWeight] = Math.max(dp[i+1][currWeight], dp[i][j]+triplets[i].value);
                    }
                }
            }
        }
        long max = 0;
        for(long i: dp[n])
            max = Math.max(max, i);
        System.out.println(max);
    }
}