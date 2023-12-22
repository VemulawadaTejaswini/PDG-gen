import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = Integer.parseInt(scanner.next());
            arr[i][1] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        int[] index = new int[N];
        for (int i = 0; i < N; i++) index[i] = i;

        double total = 0;
        int count = 0;

        do {
            for (int i = 0; i < N - 1; i++) {
                total += Math.sqrt(Math.pow(arr[index[i]][0] - arr[index[i + 1]][0], 2) + Math.pow(arr[index[i]][1] - arr[index[i + 1]][1], 2));
            }
            count++;
        } while (findNextPermutation(index));
        System.out.println(total / count);
    }

    private static int[] swap(int[] data, int left, int right) {
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;
        return data;
    }

    private static int[] reverse(int[] data, int left, int right) {
        while (left < right) {
            swap(data, left, right);
            left++;
            right--;
        }
        return data;
    }

    private static boolean findNextPermutation(int[] data) {
        if (data.length <= 1) return false;

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
        if (last < 0) return false;

        int pivot = data.length - 1;

        // 末尾から昇順が終わる位置を探す
        for (int i = data.length - 1; i > last; i--) {
            if (data[i] > data[last]) {
                pivot = i;
                break;
            }
        }

        // Swap the successor and the pivot
        swap(data, pivot, last);

        // Reverse the suffix
        reverse(data, last + 1, data.length - 1);

        return true;
    }
}

