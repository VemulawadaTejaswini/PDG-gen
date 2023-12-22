import java.util.Scanner;

class Main {


    public static long getMaxValue(int[] weights, int[] values, int numWeights, int weightPossible) {
        return getMaxValueHelper(0, weights, values, numWeights, weightPossible);
    }

    private static long getMaxValueHelper(int i, int[] weights, int[] values, int numWeights, int weightPossible) {
        if(i == numWeights) {
            return 0;
        }

        if(weightPossible == 0) {
            return 0;
        }

        long poss1 = (weightPossible - weights[i] >= 0) ? (long) values[i] + getMaxValueHelper(i+1, weights, values, numWeights, weightPossible - weights[i]) : 0;
        long poss2 = getMaxValueHelper(i+1, weights, values, numWeights, weightPossible);
        return Math.max(poss1, poss2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numWeights = scanner.nextInt();
        int bagSize = scanner.nextInt();

        int[] weights = new int[numWeights];
        int[] value = new int[numWeights];

        for(int i=0; i<numWeights; i++) {
            weights[i] = scanner.nextInt();
            value[i] = scanner.nextInt();
        }

        System.out.println(getMaxValue(weights, value, numWeights, bagSize));
    }
}
