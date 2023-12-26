public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[][] matrix = new int[n][2];
        for (int i = 0; i < n; i++) {
            matrix[i][0] = sc.nextInt();
            matrix[i][1] = sc.nextInt();
        }
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (matrix[i][1] <= t) {
                minCost = Math.min(minCost, matrix[i][0]);
            }
        }
        System.out.println(minCost == Integer.MAX_VALUE ? "TLE" : minCost);
    }
}
