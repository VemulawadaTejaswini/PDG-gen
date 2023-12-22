import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner dataScanner = new Scanner(System.in);
        int numCards = Integer.parseInt(dataScanner.nextLine());
        String[] dataStr = dataScanner.nextLine().split(" ");
        int[] dataInt= new int[numCards];
        for (int i = 0; i < numCards; i++) {
            dataInt[i] = Integer.parseInt(dataStr[i]);
        }
        Arrays.sort(dataInt);
        int diff = 0;
        for (int i = 0; i < numCards; i++) {
            if (i % 2 == 0) {
                diff = diff + dataInt[numCards - i - 1];
            } else {
                diff = diff - dataInt[numCards - i - 1];
            }
        }
        System.out.println(diff);
    }
}
