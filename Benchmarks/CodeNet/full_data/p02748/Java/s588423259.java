import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[A];
        int mina = 1000000;
        for(int i = 0; i < A; i++){
            a[i] = scan.nextInt();
            if(mina > a[i]) mina = a[i];
        }
        int[] b = new int[B];
        int minb = 1000000;
        for(int i = 0; i < B; i++){
            b[i] = scan.nextInt();
            if(minb > b[i]) minb = b[i];
        }
        int[] x = new int[m];
        int[] y = new int[m];
        int[] c = new int[m];
        for(int i = 0; i < m; i++){
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
            c[i] = scan.nextInt();
        }
        long min = mina + minb;
        for(int i = 0; i < m; i++){
            if(min > a[x[i] - 1] + b[x[i] - 1] - c[i]) min = a[x[i] - 1] + b[x[i] - 1] - c[i];
        }
        System.out.println(min);
        scan.close();
    }
}