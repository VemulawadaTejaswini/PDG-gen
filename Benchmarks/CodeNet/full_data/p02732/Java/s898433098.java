import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] num = new int[n + 1];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            num[a[i]]++;
        }

        long[] ncr = new long[n + 1];
        long[] ncr1 = new long[n + 1];

        for(int i = 0; i <= n; i++){
            ncr[i] = num[i] * (num[i] - 1) / 2;
            ncr1[i] = (num[i] - 1) * (num[i] - 2) / 2;
        }

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 1; j <= n; j++){
                if(a[i] == j){
                    sum += ncr1[j];
                }else{
                    sum += ncr[j];
                }
            }
            System.out.println(sum);
        }

    }
}
