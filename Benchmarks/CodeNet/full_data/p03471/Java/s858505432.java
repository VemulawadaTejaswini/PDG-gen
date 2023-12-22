import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int otoshidama = sc.nextInt();

        int x = -1;
        int y = -1;
        int z = -1;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j + i <= n; j++) {
                int k = n - i - j;
                if (i * 10000 + j * 5000 + k * 1000 == otoshidama) {
                    x = i;
                    y = j;
                    z = k;
                    break;
                }
            }
        }
        System.out.println(x + " " + y + " " + z);
    }
}