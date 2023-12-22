import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int maxBase = (int) Math.sqrt(x);
        int maxRes = 1;
        for (int i = maxBase; i > 1; i--) {
            int exponential = i;
            int tmpMax = 0;
            while (true) {
                exponential *= exponential;
                if (exponential > x) {
                    break;
                } else {
                    tmpMax = exponential;
                }
            }

            maxRes = Math.max(maxRes, tmpMax);
        }

        System.out.println(maxRes);
    }
}
