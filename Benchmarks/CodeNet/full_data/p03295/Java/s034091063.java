import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int a[] = new int[M + 1];
        int b[] = new int[M + 1];
        int count = 1;
        for (int x = 1; x <= M; x++) {
            a[x] = scanner.nextInt();
            b[x] = scanner.nextInt();
        }
        Arrays.sort(b);
        for(int x = 1; x<=M; x++){
            if (a[x] > b[1]) {
                count++;
            }
        }
        System.out.println(count);

    }

}
