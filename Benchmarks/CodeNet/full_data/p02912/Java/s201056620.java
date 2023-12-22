import java.util.Arrays;
import java.util.Scanner;
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
            // 最大値を取得して割る2
            Arrays.sort(a);
            if(a[N - 1] == 0){
                break;
            }
            a[N - 1] /= 2;
            M--;
        }
        for(int i = 0; i < N; i++){
            result += a[i];
        }
        System.out.println(result);
    }
}
