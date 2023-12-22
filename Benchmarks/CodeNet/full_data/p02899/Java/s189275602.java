import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[][] a = new int[N][2];
        for (int i = 0; i < N; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = i+1;
        }
        Arrays.sort(a, (o1, o2) -> o1[0]-o2[0]);
        for (int i = 0; i < N; i++) {
            if (i!=0){
                System.out.print(" ");
            }
            System.out.print(a[i][1]);
        }
        System.out.println();
    }
}
