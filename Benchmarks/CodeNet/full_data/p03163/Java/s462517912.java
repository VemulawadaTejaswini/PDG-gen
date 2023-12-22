import java.util.Scanner;

public class Main {
    static final int WEIGHT_INDEX = 0;
    static final int VALUE_INDEX = 1;

    private static int take(int itemNumber,
                            int totalNumberOfItems,
                            int knapsackWeightCapacity,
                            int[][] weightValue) {
        if (itemNumber > totalNumberOfItems - 1 ||
                knapsackWeightCapacity == 0) {
            return 0;
        }
        return Math.max(
                knapsackWeightCapacity - weightValue[itemNumber][WEIGHT_INDEX] >= 0 ?
                        weightValue[itemNumber][VALUE_INDEX] + take(itemNumber + 1, totalNumberOfItems, knapsackWeightCapacity - weightValue[itemNumber][WEIGHT_INDEX], weightValue) :
                        0,
                take(itemNumber + 1, totalNumberOfItems, knapsackWeightCapacity, weightValue)
        );
    }

    public static void main(String[] args) {
        int maxValue = 0;
        Scanner sc = new Scanner(System.in);
        int numberOfItems = sc.nextInt();
        int knapsackWeightCapacity = sc.nextInt();

        int[][] weightValue = new int[numberOfItems][2];
        for (int i = 0; i < numberOfItems; i++) {
            weightValue[i][WEIGHT_INDEX] = sc.nextInt();
            weightValue[i][VALUE_INDEX] = sc.nextInt();
        }

        maxValue =
                take(0, numberOfItems, knapsackWeightCapacity, weightValue);


        System.out.println(maxValue);
    }
}
