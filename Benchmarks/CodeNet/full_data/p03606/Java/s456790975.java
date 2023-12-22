import java.util.*;

public class Main {
    private static Integer res= 0;
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            count += r - l +1;
        }
        System.out.println(count);
    }
}