import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int l =  sc.nextInt();
            count += l;
            if (max < l) max = l;
        }

        count -= max;

        if (count > max ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
