import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        int p = sc.nextInt();

        int[] a = new int[n];

        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);

        int[] copy_a = a;

        int base_cnt = 0;

        int div = a[n-p];

        int idx = 0;

        for (int i=0; i<n; i++){
            if (a[i]==div){
                base_cnt = (n-i);
                idx = i;
                break;
            }
        }

//        System.out.println(base_cnt);

        if ((a[idx]-a[idx-1])>m){
            System.out.println(base_cnt);
            return;
        }

        int[][] copy_idx = new int[n][2];

        for (int i=0; i<n; i++){
            copy_idx[i][0] = a[i];
            copy_idx[i][1] = i;
        }

        for (int i=0; i<v; i++){
            copy_idx[i][0] += m;
        }


        Arrays.sort(copy_idx, (x, y) -> Integer.compare(x[0], y[0]));

        int tmp = copy_idx[n-p][0];

//        System.out.println(tmp);

        int ans = 0;

        for (int i=0; i<n; i++){
            if (tmp==copy_idx[i][0]){
                ans = idx - copy_idx[i][1];
                break;
            }
        }
        System.out.println(base_cnt+ans);



    }
}