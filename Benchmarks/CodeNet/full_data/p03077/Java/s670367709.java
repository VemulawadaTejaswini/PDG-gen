import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        long[] arr = new long[5];
        for (int i=0; i<5; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        DecimalFormat format = new DecimalFormat("0.#");
        System.out.println(format.format(Math.floor(T/arr[0])+5));
    }
}
