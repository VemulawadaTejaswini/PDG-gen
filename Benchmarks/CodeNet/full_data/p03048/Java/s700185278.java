import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; R * i <= n; i++) {
            for (int j = 0; G * j <= n; j++) {
                if (R * i + G * j > n) {
                    break;
                }
                for (int k = 0; B * k <= n; k++) {
                    int val = R * i + G * j + B * k;
                    if (val == n) {
                        count++;
                    }
                    if (val > n) {
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}