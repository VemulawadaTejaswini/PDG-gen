import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] array = new int[n];
        int i = 0;
        for(String ai : scanner.nextLine().split(" ")) {
            array[i++] = Integer.parseInt(ai);
        }

        int op = 0;
        if (array[0] == 0) {
            if (array[1] > 0) {
                array[0]--;
            } else {
                array[0]++;
            }
            op++;
        }
        int pos;
        while ((pos = getpos(array, n)) >= 0) {
            if (array[0] > 0) {
                if (pos % 2 == 0) {
                    array[pos]++;
                } else {
                    array[pos]--;
                }
            } else {
                if (pos % 2 == 0) {
                    array[pos]--;
                } else {
                    array[pos]++;
                }
            }
            op++;
        }
        System.out.println(op);
    }

    public static int getpos(int[] array, int n) {
        int sum = array[0];
        if (sum == 0) {
            return 0;
        }

        boolean previous = sum > 0; // +: true -: false

        for(int i = 1; i < n; i++) {
            sum += array[i];
            if (sum == 0) {
                return i;
            }

            if (previous && sum > 0) {
                return i;
            }

            if (!previous && sum < 0) {
                return i;
            }

            previous = sum > 0;
        }

        return -1;
    }
}