import java.util.*;
import static java.lang.Math.abs;
import static java.lang.Math.max;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] h = new int[N];
        for(int i = 0; i < N; i++){

            h[i] = scan.nextInt();
        }

        int[] l = new int[N];
        for(int i = 0; i < N; i++){

            l[i] = scan.nextInt();
        }


        int tmp = 0;
        int ans = 0;
        for(int i = 0; i < N; i++ ){

            tmp = 0;

            for(int j = 0; j <= i; j++){

                tmp += h[j];
            }

            for(int j = i; j < N; j++){

                tmp += l[j];
            }

            ans = max(ans, tmp);
        }

        System.out.print(ans);
        
    }
}