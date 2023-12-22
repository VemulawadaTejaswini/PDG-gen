import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] x = new int[q];
        for(int i = 0; i < q; i++){
            x[i] = sc.nextInt();
            if(x[i] > a[n-1]) x[i] = a[n-1] - 1;
        }
        int[] mid = new int[n];
        mid[0] = 0;
        for(int i = 1; i < n; i++){
            mid[i] = (a[i-1] + a[i]) / 2;
        }
        long[] sum = new long[n+1];
        sum[n-1] = 0;
        for(int i = n-2; i >= 0; i--){
            sum[i] = sum[i+1] + a[i+1];
        }
        sum[n] = sum[n-1] = a[n-1];
        long[] sumsum = new long[(n + 1) / 2];
        if(n % 2 == 0){
            sumsum[0] = 0;
            for(int i = 1; i < sumsum.length; i++){
                sumsum[i] = sumsum[i-1] + a[i * 2 - 1];
            }
            for(int i = 0; i < q; i++){
                int k = Arrays.binarySearch(mid, x[i]-1);
                if(k < 0) k = ~k - 1;
      //          System.out.println(k + " " + sumsum[k/2] + "  "+ sum[k+1]);
                if(k <= (n-1) / 2) System.out.println((sumsum[(k)/2] + sum[(n-1)/2]));
                else System.out.println((sumsum[k/2] + sum[k+1]));
            }
        }
        else{
            sumsum[0] = 0;
            for(int i = 1; i < sumsum.length; i++){
                sumsum[i] = sumsum[i-1] + a[(i-1) * 2];
            }
            for(int i = 0; i < q; i++){
                int k = Arrays.binarySearch(mid, x[i]-1);
                if(k < 0) k = ~k - 1;
 //               System.out.println(k + " " + sumsum[(k +1 )/2] + "  " + sum[k]);
                if(k < n / 2) System.out.println((sumsum[(k+1)/2] + sum[(n-2)/2]));
                else System.out.println((sumsum[(k +1 )/2] + sum[k]));
            }
        }
    }
}

/*
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] c = new char[h][w];
        for(int i = 0; i < h; i++){
            String s = sc.next();
            for(int j = 0; j < w; j++){
                c[i][j] = s.charAt(j);
            }
        }
        */