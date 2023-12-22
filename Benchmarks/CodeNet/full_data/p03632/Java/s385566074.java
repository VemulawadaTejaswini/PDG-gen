import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int result = 0;

        for (int i = a; i <= b; i++) {
            for (int j = c; j <= d; j++) {
                if (i == j) {
                    result++;
                    break;
                }
            }
        }

        if (result > 0) {
            result--;
        }

        System.out.println(result);
    }
}