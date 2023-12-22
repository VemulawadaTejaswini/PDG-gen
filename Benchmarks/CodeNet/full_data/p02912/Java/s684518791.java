import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int M = scan.nextInt();
        int result = 0;
        Integer[] a = new Integer[N];
        for(int i = 0;i < N; i++){
            a[i] = scan.nextInt();
        }
        scan.close();
        while(M > 0){
            Arrays.sort(a,Collections.reverseOrder());
            a[0] /= 2;
            M--;
        }
        for(int i = 0; i < N; i++){
            result += a[i];
        }
        System.out.println(result);
    }
}
