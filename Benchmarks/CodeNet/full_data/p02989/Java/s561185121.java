import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = scanner.nextInt();
        }
        Arrays.sort(d);

        if(d[d.length/2 - 1] == d[d.length/2]){
            System.out.println(0);
        } else {
            System.out.println(d[d.length/2] - d[d.length/2 - 1]);
        }
    }
}
