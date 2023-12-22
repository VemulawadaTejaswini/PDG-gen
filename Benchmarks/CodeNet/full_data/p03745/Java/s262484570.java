import java.util.*;

public class Main {
    public static List<int[]> list = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmp = sc.nextInt();
        boolean big = false;
        boolean small = false;
        int count = 0;
        for (int i = 1; i < N; i++) {
            int now = sc.nextInt();
            if (now < tmp) {
                if (big) {
                    big = false;
                    count++;
                } else {
                    small = true;
                }
            } else if (tmp < now) {
                if (small) {
                    small = false;
                    count++;
                } else {
                    big = true;
                }
            } else {
                continue;
            }
            tmp = now;
        }
        System.out.println(count+1);
    }
}