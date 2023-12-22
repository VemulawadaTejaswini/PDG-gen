import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int nGood = 0;
        while (N > 0) {
            int h = sc.nextInt();
            if (h >= max) {
                nGood += 1;
                max = h;
            }
            N -= 1;
        }

        System.out.println(nGood);
    }

}
