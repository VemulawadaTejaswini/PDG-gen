import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];


        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            int max = 0;
            for(int j = 1; j < n; j++){
                if(a[max] < a[j]){
                    max = j;
                }
            }
            a[max] /= 2;
            /*
            for(int j = 0; j < n; j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();

             */
        }

        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += a[i];
        }
        System.out.println(ans);
    }

}
