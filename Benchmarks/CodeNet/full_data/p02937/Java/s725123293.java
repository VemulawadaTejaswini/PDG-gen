import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static char base[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char paramS[] = scanner.nextLine().toCharArray();
        char paramT[] = scanner.nextLine().toCharArray();
        scanner.close();

        int currentSIndex = -1;
        int currentRow = 0;
        int result = 0;

        for (char t: paramT) {
            int i = stringIndexOfWithOffset(paramS, 0, t);
            if (i == -1) {
                result = -1;
                break;
            } else {
                int pos = stringIndexOfWithOffset(paramS, currentSIndex + 1, t);
                if (pos == -1) {
                    currentRow += 1;
                    currentSIndex = i;
                } else {
                    currentSIndex = pos;
                }
            }
        }

        if (result != -1) result = paramS.length * currentRow + currentSIndex + 1;

        System.out.println(result);
    }

    private static int stringIndexOfWithOffset(char[] list, int offset, char c) {
        for (int i = offset; i < list.length; i++) {
            if (list[i] == c) return i;
        }
        return -1;
    }
}