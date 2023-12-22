import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] As = new int[N];
        int[] Bossz = new int [N];
        for (int n = 1; n < N; n++) {
            As[n] = sc.nextInt();
        }

        for (int n = 1; n < N; n++) {
//            System.out.println(" "+n+" "+As[n]);
            Bossz[As[n] - 1]++;
        }

        for (int n = 0; n < N; n++) {
//            System.out.println(" "+n+" "+As[n]+" "+Bossz[n]);
            System.out.println(Bossz[n]);
        }
    }
}