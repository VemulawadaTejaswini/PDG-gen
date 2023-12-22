import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/* AtCoder AGC001-A
 * BBQ easy : Find the maximum sum */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfSticks;
        int[] lenOfSticksArr;

      
        numOfSticks = scanner.nextInt() << 1; // 2N

        lenOfSticksArr = new int[numOfSticks];
        for (int i=0; i<numOfSticks; i++) {
          lenOfSticksArr[i] = scanner.nextInt();
        }

        // --------------------------------------------

        System.out.println(solve(lenOfSticksArr));
    }

    /**
     * Solve function for AGC001A
     *
     * We can find the answer for this problem just using sort.
     * The BBQ can needs 2 sticks, and the max # of ingredient is a smaller length of sticks.
     * Namely we can make BBQ with A ingredients when length A is shorter than B.
     * For example, sticks that length 10 and 7, can make 1 BBQ with 7 ingredients cause 7 < 10.
     * In other words, we can solve this problem just using sorting, and just get the odd number of values.
     *
     * ex) 3 10 8 6 can ordered
     * 3 6 8 10, and we know that
     * 3<6 and 8<10
     * so the answer is 3+8 = 11.
     * Of course, we can make the BBQ like 3 and 10, 8 and 6. but
     * if this will be 3<10 and 6<8, so the max number of ingredient is 3+6 = 9.
     *
     * @param arr the array of sticks
     * @return the maximum sum that we can stick ingredients */
    static int solve(int[] arr) {
        // sort array in ascending order
        Arrays.sort(arr);

        // add odd number of values
        int sum = 0;
        for (int i=0; i<arr.length; i+=2) {
            sum += arr[i];
        }

        return sum;
    }
}
