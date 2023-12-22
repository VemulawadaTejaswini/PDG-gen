
import java.util.*;

public class Main {
    private final static Main main = new Main();

    public static void main(String[] args) {
        main.contest();
    }

    private void contest() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int[] list = new int[n];
        for (int i=0; i<n; ++i) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);

        int num = 1;
        int top = list[0];
        int count = 1;
        for (int i=1; i<n; ++i) {
            int t = list[i];
            if (count == c || top+k < t) {
                ++num;
                top = t;
                count = 0;
            } else {
                ++count;
            }
        }
        System.out.println(num);
    }
}
