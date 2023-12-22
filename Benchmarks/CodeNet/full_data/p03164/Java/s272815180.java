import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static long getMaxCost(int[] w, int[] v, int numWeights, int bagSize) {


        int totalValueSum = 0;
        for(int i=0; i<v.length; i++)
            totalValueSum+=v[i];

        long[] minCost = new long[totalValueSum + 1];

        Arrays.fill(minCost, 1 << 60);

        minCost[0] = 0;

        for(int j=0; j<numWeights; j++) {
            for(int i=totalValueSum; i>=v[j]; i--) {
                minCost[i] = Math.min(minCost[i], (long) w[j] + minCost[i-v[j]]);
            }
        }

        Long maxCost = Long.MIN_VALUE;

        for(int i=1; i<=totalValueSum; i++) {
            if(minCost[i] <= (long) bagSize) {
                maxCost = Math.max(maxCost, i);
            }
        }
        return maxCost;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numWeights = scanner.nextInt();
        int bagSize = scanner.nextInt();

        int[] weights = new int[numWeights];
        int[] values = new int[numWeights];

        for(int i=0; i<numWeights; i++) {
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
        }
        System.out.println(getMaxCost(weights, values, numWeights, bagSize));
    }

}
