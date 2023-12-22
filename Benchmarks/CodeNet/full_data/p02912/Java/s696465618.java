import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int M = scan.nextInt();
        long result = 0;
        Long[] a = new Long[N];
        for(int i = 0;i < N; i++){
            a[i] = scan.nextLong();
        }
        scan.close();
        while(M > 0){
            Arrays.sort(a, Collections.reverseOrder());
            while(a[0] >= a[1] && M > 0){
                a[0] /= 2;
                M--;
            }
        }
        for(int i = 0; i < N; i++){
            result += a[i];
        }
        System.out.println(result);
    }
}
