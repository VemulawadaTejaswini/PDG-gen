import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[13];
        int freeC = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (a >= 3200) {
                freeC++;
            } else {
                ary[a / 400]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < 13; i++) {
            if (ary[i] != 0) {
                ans++;
            }
        }
        System.out.println(ans + " " + (ans + freeC));
    }
}