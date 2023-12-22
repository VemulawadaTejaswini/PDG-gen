import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] D = new int[n];
        Arrays.setAll(D, i -> Integer.parseInt(sc.next()));
        Arrays.sort(D);
        System.out.println(D[n/2] - D[n/2-1]);
    }
}
