import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[][] wrongness = new int[c][c];
        List<List<Integer>> colors = new ArrayList<>();
        colors.add(0,new ArrayList<>());
        colors.add(0,new ArrayList<>());
        colors.add(0,new ArrayList<>());
        for (int i = 0; i < wrongness.length; i++) {
            for (int j = 0; j < wrongness.length; j++) {
                wrongness[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                colors.get((i + j) % 3).add(sc.nextInt()-1);
            }
        }
        int bestCost = Integer.MAX_VALUE;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                if (i != j) {
                    for (int k = 0; k < c; k++) {
                        if (k != i && k != j) {
                            int cost = 0;
                            for (int l = 0; l < colors.get(0).size(); l++) {
                                cost += wrongness[colors.get(0).get(l)][i];
                            }
                            for (int l = 0; l < colors.get(1).size(); l++) {
                                cost += wrongness[colors.get(1).get(l)][j];
                            }
                            for (int l = 0; l < colors.get(2).size(); l++) {
                                cost += wrongness[colors.get(2).get(l)][k];
                            }
                            bestCost = Math.min(cost, bestCost);
                        }
                    }
                }
            }
        }
        System.out.println(bestCost);
        sc.close();
    }
}
