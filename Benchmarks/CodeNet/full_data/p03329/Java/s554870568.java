import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] i = {46656, 59049, 7776, 6561, 1296, 729, 216, 91, 36, 9, 6, 1};

        int count = 0;
        while (N > 0) {
            for (int j = 0; j < i.length; j++) {
                if (N > i[j]) {

                    N -= i[j];
                    System.out.println(N);
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}