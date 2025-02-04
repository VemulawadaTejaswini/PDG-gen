import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCases = scanner.nextInt();
        int[] array = new int[numOfCases];
        boolean isLeft = true;
        for (int i = 0; i < numOfCases; i++) {
            array[i] = scanner.nextInt();
        }
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int[] output = new int[numOfCases];
        for (int i = numOfCases - 1; i >= 0; i--) {
            if (isLeft) {
                output[leftIndex++] = array[i];
            }
            else {
                output[rightIndex--] = array[i];
            }
            isLeft = !isLeft;
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}