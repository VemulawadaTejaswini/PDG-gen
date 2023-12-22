
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] =  in.nextInt();

        }

        System.out.println(lds(a, a.length));

    }

    static int lds(int arr[], int n) {
        int lds[] = new int[n];
        int i, j, max = 0;

        // Initialize LDS with 1
        // for all index. The minimum
        // LDS starting with any
        // element is always 1
        for (i = 0; i < n; i++)
            lds[i] = 1;

        // Compute LDS from every
        // index in bottom up manner
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] < arr[j] &&
                        lds[i] < lds[j] + 1)
                    lds[i] = lds[j] + 1;

        // Select the maximum
        // of all the LDS values
        for (i = 0; i < n; i++)
            if (max < lds[i])
                max = lds[i];

        // returns the length
        // of the LDS
        return max;
    }


}
