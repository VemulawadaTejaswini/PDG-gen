import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer N = scanner.nextInt();
        Integer M = scanner.nextInt();
        Integer[] inputList = new Integer[N];
        Integer sum = 0;

        for (Integer i = 0; i < N; i++) {
            Integer vote = scanner.nextInt();
            inputList[i] = vote;
            sum += vote;
        }
      
        Arrays.sort(inputList, Collections.reverseOrder());
        System.out.println(inputList[M-1]);
        if (inputList[M - 1] > sum / (4 * M)) {
            System.out.println("Yes");
        } else {
            System.out.print("No");
        }
    }
}