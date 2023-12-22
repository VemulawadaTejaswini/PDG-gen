import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n*2];
        int arr3[] = new int[n*3];
        for (int i=0; i<n; i++) arr1[i] = sc.nextInt();
        System.arraycopy(arr1, 0, arr2, 0, n);
        System.arraycopy(arr1, 0, arr2, n, n);
        System.arraycopy(arr2, 0, arr3, 0, n*2);
        System.arraycopy(arr1, 0, arr3, n*2, n);

//        System.out.println(arr3[n*3-1]);

        int mod = (int)1e9 + 7;

        long count = 0;

        long inv1 = 0;
        long inv2 = 0;
        long inv3 = 0;


        for (int i=0; i<=n-2; i++){
            for (int j=1; j<=n-1; j++){
                if (arr1[i]>arr1[j]){
                    inv1++;
                }
            }
        }
        for (int i=0; i<=n*2-2; i++){
            for (int j=1; j<=n*2-1; j++){
                if (arr2[i]>arr2[j]){
                    inv2++;
                }
            }
        }
        for (int i=0; i<=n*3-2; i++){
            for (int j=1; j<=n*3-1; j++){
                if (arr3[i]>arr3[j]){
                    inv3++;
                }
            }
        }

        long diff2 = inv3-inv2;
        long diff1 = inv2-inv1;
        long diff;
        diff = diff2-diff1;
        
        long a;
        a = inv1 * 2 - diff;
        double b;
        b = a/2;
        double temp;
        temp = (double)a/2;
        if (a/2!=(long)temp){
            b += (double)1/2; 
        }
        
        System.out.println((diff*k*k/2+b*k)%mod);

//        System.out.println(Math.sqrt(2 * Math.pow(10, 12)));




    }
}