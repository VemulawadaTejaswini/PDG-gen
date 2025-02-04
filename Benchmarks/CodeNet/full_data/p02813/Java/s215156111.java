import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//atcoderはScannerクラスのsc.next()で行ける
public class Main {
    ArrayList<int[]> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for (int k = 0; k < n; k++) {
            q[k] = sc.nextInt();
        }
        int[] data  = new int[n];
        for (int i = 1 ; i<=n ; i++){
            data[i-1]=i;
        }
        int cnt = 0;
        int a=0,b=0;
        do {
            cnt++;
            if (Arrays.equals(p,data)){
                a = cnt;
            }
            if (Arrays.equals(q,data)){
                b = cnt;
            }
        }
        while (findNextPermutation(data));
        System.out.println(Math.abs(a-b));

    }

    // Function to swap the data
    // present in the left and right indices
    public static int[] swap(int data[], int left, int right) {

        // Swap the data
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;

        // Return the updated array
        return data;
    }

    // Function to reverse the sub-array
    // starting from left to the right
    // both inclusive
    public static int[] reverse(int data[], int left, int right) {

        // Reverse the sub-array
        while (left < right) {
            int temp = data[left];
            data[left++] = data[right];
            data[right--] = temp;
        }

        // Return the updated array
        return data;
    }

    // Function to find the next permutation
    // of the given integer array
    public static boolean findNextPermutation(int data[]) {

        // If the given dataset is empty
        // or contains only one element
        // next_permutation is not possible
        if (data.length <= 1)
            return false;

        int last = data.length - 2;

        // find the longest non-increasing suffix
        // and find the pivot
        while (last >= 0) {
            if (data[last] < data[last + 1]) {
                break;
            }
            last--;
        }

        // If there is no increasing pair
        // there is no higher order permutation
        if (last < 0)
            return false;

        int nextGreater = data.length - 1;

        // Find the rightmost successor to the pivot
        for (int i = data.length - 1; i > last; i--) {
            if (data[i] > data[last]) {
                nextGreater = i;
                break;
            }
        }

        // Swap the successor and the pivot
        data = swap(data, nextGreater, last);

        // Reverse the suffix
        data = reverse(data, last + 1, data.length - 1);

        // Return true as the next_permutation is done
        return true;
    }
}