import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if(((int) Math.log10(i) + 1) % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

}

