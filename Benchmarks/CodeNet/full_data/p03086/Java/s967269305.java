import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.next().toCharArray();
        final char[] ATCG_CHARS = { 'A', 'C', 'G', 'T' };

        int maxLength = 0;
        int currentLength = 0;
        for (char c : text) {
            if (Arrays.binarySearch(ATCG_CHARS, c) >= 0) {
                currentLength++;
            } else {
                maxLength = Math.max(currentLength, maxLength);
                currentLength = 0;
            }
        }
        System.out.println(Math.max(currentLength, maxLength));
    }
}