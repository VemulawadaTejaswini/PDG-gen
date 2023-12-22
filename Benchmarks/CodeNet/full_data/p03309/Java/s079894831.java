import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        N = scanner.nextInt();
        int[] val = new int[N];
        for (int x = 0; x < N; x++) val[x] = scanner.nextInt();
        int sum = 0;
        int[] b = new int[N];
        for (int x= 0;x<N; x++){
            b[x] = val[x] - x;
        }
        Arrays.sort(b);
        int bb = b[N/2];

            for (int x = 0; x < N; x++) {
                sum = sum + Math.abs(val[x] - (bb + x));
            }


        System.out.println(sum);
    }

}
