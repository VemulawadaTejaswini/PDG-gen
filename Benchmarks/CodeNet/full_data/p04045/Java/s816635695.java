import java.util.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer[] d = new Integer[K];

        for(int i = 0 ; i < K ; i++){
            d[i] = sc.nextInt();
        }

        boolean ok = true;

        while(ok){
            int N1 = N / 1000;
            int N2 = (N % 1000) / 100;
            int N3 = (N % 100) / 10;
            int N4 = N % 10;
            
            boolean NG1 = (N >= 1000 ? Arrays.asList(d).contains(N1) : false);
            boolean NG2 = (N >= 100 ? Arrays.asList(d).contains(N2) : false);
            boolean NG3 = (N >= 10 ? Arrays.asList(d).contains(N3) : false);
            boolean NG4 = Arrays.asList(d).contains(N4);

            if (NG1 || NG2 || NG3 || NG4) {
                N++;
            }
            else
                ok = false;
        }

        System.out.println(N);
    }
}