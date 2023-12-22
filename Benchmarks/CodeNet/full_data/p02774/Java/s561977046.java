import java.util.*;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] arr = new int[n];

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i=0; i<n; i++){
            int tmp = sc.nextInt();
            if (tmp<0) negative++;
            else if (0<tmp) positive++;
            else zero++;
            arr[i] = tmp;
        }
        Arrays.sort(arr);

//        for (int i=0; i<n; i++) System.out.println(arr[i]);


//        for (int i=0; i<n; i++) System.out.println(arr[i]);

        int[] plus = new int[positive];
        int[] minus = new int[negative];

        int p = 0;
        int q = 0;

        for (int i=0; i<n; i++){
            if (arr[i]<0) minus[q++] = arr[i];
            else if (0<arr[i]) plus[p++] = arr[i];
        }

//        for (int i=0; i<plus.length; i++)System.out.println(plus[i]);
//        for (int i=0; i<minus.length; i++)System.out.println(minus[i]);


        long left = -(long)1e18-1;
        long right = (long)1e18+1;

        while (right-left>1){
            long mid = (right+left)/2;
            if (count(plus, minus, zero, mid)<k){
                left = mid;
            }else {
                right = mid;
            }
        }

        System.out.println(right);
//        while (left<right){
//            long mid = (left+right)/2;
////            System.out.println(mid);
//            System.out.println(count(plus, minus, zero, mid));
//            if (count(plus, minus, zero, mid)<k){
//                left = mid+1;
//            }else {
//                right = mid;
//            }
//        }

//        System.out.println(left-1);

//        for (int i=0; i<n; i++)System.out.println(arr[i]);


    }

    public static long count(int[] posi, int[] nega, int z, long mid){
        long res = 0;
        int t = posi.length-1;
        for (int i=0; i<posi.length-1; i++){
            while (t>=0 && posi[i]*posi[t]>mid) --t;
            res += Math.max(0, t-i);
        }

        t = 0;
        for (int i=nega.length-1; i>=0; i--){
            while (t<nega.length && nega[i]*nega[t]>mid) ++t;
            res += Math.max(0, i-t);
        }

        t = 0;
        for (int i=0; i<posi.length; i++){
            while (t<nega.length && posi[i]*nega[t]<=mid) ++t;
            res += Math.max(0, t);
        }

        if (0<=mid) res += z*(posi.length+nega.length)+z*(z-1)/2;
        return res;
    }
}

