import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), c = sc.nextInt();
        int[] A = new int[m];
        int[] B = new int[m];
        int res = 0;
        Arrays.setAll(B, i -> Integer.parseInt(sc.next()));
        for(int i = 0; i < n; i++) {
            int sum = c;
            for(int b : B) {
                sum += b * Integer.parseInt(sc.next());
            }
            if(sum > 0) res++;
        }
        System.out.println(res);
    }
}