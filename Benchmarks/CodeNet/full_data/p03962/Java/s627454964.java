import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        boolean[] b = new boolean[101];
        for (int i = 0;i < 3;i++) {
            b[sc.nextInt()] = true;
        }
        int ret = 0;
        for (int i = 1;i <= 100;i++) {
            if (b[i]) ret++;
        }
        System.out.println(ret);
    }
}
