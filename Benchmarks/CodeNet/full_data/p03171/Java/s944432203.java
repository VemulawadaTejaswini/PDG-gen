import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

        }
        System.out.println(getXY(arr, 0, arr.length - 1, 0));

    }

    public static int getXY(int arr[], int start, int end, int p) {
        if (start == end) {
            if (p == 0) {
                return arr[start];
            } else
                return -arr[start];
        }

        int o = (p == 1) ? 0 : 1;
        int op1 = getXY(arr, start + 1, end, o);
        int op2 = getXY(arr, start, end - 1, o);
        if (p == 0) {
            op1 += arr[start];
            op2 += arr[end];
            return Math.max(op1, op2);
        } else {
            op1 -= arr[start];
            op2 -= arr[end];
            return Math.min(op1, op2);
        }

    }
}
