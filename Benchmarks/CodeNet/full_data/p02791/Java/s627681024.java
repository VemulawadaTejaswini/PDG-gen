import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long min = Long.MAX_VALUE;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            if (min > temp) {
                ans++;
                min = temp;
            }
        }
        System.out.println(ans);
    }
}
