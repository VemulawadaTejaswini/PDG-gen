import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by dizzyvn on 6/24/17.
 */
public class Main {

    public static void main(String[] args) {

        class ArrayIndexComparator implements Comparator<Integer> {

            private final int[] array;


            public ArrayIndexComparator(int[] array) {
                this.array = array;
            }


            public Integer[] createIndexArray() {
                Integer[] indexes = new Integer[array.length];
                for (int i = 0; i < array.length; i++) {
                    indexes[i] = i; // Autoboxing
                }
                return indexes;
            }


            @Override
            public int compare(Integer idx1, Integer idx2) {
                // Autounbox from Integer to int to use as array indexes
                if (array[idx1] < array[idx2]) return -1;
                if (array[idx1] > array[idx2]) return 1;
                return 0;
            }
        }

        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] X = new int[n];
        int[] Y = new int[n];
        int[] x_cost = new int[n-1];
        int[] y_cost = new int[n-1];

        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        //sort
        ArrayIndexComparator xComparator = new ArrayIndexComparator(X);
        ArrayIndexComparator yComparator = new ArrayIndexComparator(Y);
        Integer[] x_index = xComparator.createIndexArray();
        Integer[] y_index = yComparator.createIndexArray();
        Arrays.sort(x_index, xComparator);
        Arrays.sort(y_index, yComparator);


        for (int i = 0; i < n-1; i++) {
            x_cost[i] = X[x_index[i + 1]] - X[x_index[i]];
            y_cost[i] = Y[y_index[i + 1]] - Y[y_index[i]];
        }

        ArrayIndexComparator xCostComparator = new ArrayIndexComparator(x_cost);
        ArrayIndexComparator yCostComparator = new ArrayIndexComparator(y_cost);
        Integer[] xCost_index = xCostComparator.createIndexArray();
        Integer[] yCost_index = yCostComparator.createIndexArray();
        Arrays.sort(xCost_index, xCostComparator);
        Arrays.sort(yCost_index, yCostComparator);

        //process
        int cost = 0;
        boolean[] flag = new boolean[n];
        int x_pos = 0;
        int y_pos = 0;
        while (x_pos < n-1 && y_pos < n-1) {
            int costX = x_cost[xCost_index[x_pos]];
            int costY = y_cost[yCost_index[y_pos]];

            // try to use x
            if (costX < costY) {
                int idx1 = x_index[xCost_index[x_pos]];
                int idx2 = x_index[xCost_index[x_pos]+1];

                if (!flag[idx1] || !flag[idx2]) {
                    cost += costX;
                    flag[idx1] = true;
                    flag[idx2] = true;
                }
                x_pos++;
            }
            // try to use y
            else {
                int idx1 = y_index[yCost_index[y_pos]];
                int idx2 = y_index[yCost_index[y_pos]+1];

                if (!flag[idx1] || !flag[idx2]) {
                    cost += costY;
                    flag[idx1] = true;
                    flag[idx2] = true;
                }
                y_pos++;
            }
        }

        //output
        System.out.println(cost);
    }
}
