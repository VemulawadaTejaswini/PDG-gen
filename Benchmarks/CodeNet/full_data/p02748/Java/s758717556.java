import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int M = scanner.nextInt();
        int[] a = new int[A];
        for(int x =0;x<A;x++){
            a[x] = scanner.nextInt();
        }
        int[] b = new int[B];
        for(int x =0;x<B;x++){
            b[x] = scanner.nextInt();
        }
        int x[] = new int[M];
        int y[] = new int[M];
        int c[] = new int[M];
        for(int X =0;X<M;X++){
            x[X] = scanner.nextInt();
            y[X] = scanner.nextInt();
            c[X] = scanner.nextInt();
        }
        int rawCost = 999999999;
        int rawCostD = 999999999;
        int[] sortedA = a;
        int[] sortedB = b;
        Arrays.sort(sortedA);
        Arrays.sort(sortedB);
        rawCost = sortedA[0]+sortedB[0];
        for(int z =0; z<M; z++){
            rawCostD = Math.min(rawCostD,a[x[z]-1]+b[y[z]-1]-c[z]);
        }
        System.out.println(Math.min(rawCost,rawCostD));
    }

}
