import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int min = sc.nextInt();
        int max = min;
        int inNum;
        for (int i = 0; i < num - 1; i++) {
            max = Math.max(sc.nextInt(), max);
        }
        int ans = 1;
        for (int i = 2; i <= max + 1; i++) {
            ans = ans * i;
        }
        System.out.println(ans);
    }
}