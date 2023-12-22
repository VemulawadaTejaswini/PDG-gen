package Samples;

import java.util.Scanner;

/**
 * Created by eulyanenkov on 02.02.14.
 */
public class Flowers {

    public static void main( String args[] ){

        Scanner in = new Scanner(System.in);

        int N, K;
        N = in.nextInt();
        K = in.nextInt();

        int C[] = new int[N];
        for(int i=0; i<N; i++){
            C[i] = in.nextInt();
        }

        System.out.println(solution(C,K));
    }

    public static int solution(int[] C, int K){

        int total = 0;
        int factor = 1;

        quickSort(C, 0, C.length - 1);

        int buyer = 1;
        for (int i = C.length - 1; i >= 0; i--){
            if (buyer > K){
                factor++;
                buyer = 1;
            }
            total += (C[i] * factor);
            buyer++;
        }

        return total;
    }

    private static void quickSort(int[] A, int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = A[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (A[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (A[j] > pivot) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quickSort(A, low, j);
        if (i < high)
            quickSort(A, i, high);
    }
}