import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int max = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a =  scanner.nextInt();
            int b = scanner.nextInt();

            if (a > max){
                max = a;
                ans = a + b;
            }
        }

        System.out.println(ans);
    }
}
