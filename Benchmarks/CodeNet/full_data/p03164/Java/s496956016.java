import java.util.Scanner;

class Main {

    public static long getMaxCost(int[] w, int[] v, int numWeights, int bagSize) {

        long[] maxCost = new long[bagSize + 1];

        maxCost[0] = 0;

            for(int j=0; j<numWeights; j++) {
                for(int i=bagSize; i>=w[j]; i--) {
                    maxCost[i] = Math.max(maxCost[i], (long) v[j] + maxCost[i-w[j]]);
            }
        }
        return maxCost[bagSize];
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
