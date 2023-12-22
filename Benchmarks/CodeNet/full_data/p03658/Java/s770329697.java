import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Integer[] l = new Integer[n];
        for(int i=0; i<n; i++) {
            l[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(l, Collections.reverseOrder());

        int out = 0;
        for(int i=0; i<k; i++) {
            out += l[i];
        }

        System.out.println(out);
    }
}
