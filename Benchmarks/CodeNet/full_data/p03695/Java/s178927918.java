import java.util.*;
class Abc
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[9];
        for(int i = 0; i < n; i++){
            int k = sc.nextInt();
            if(   0 <= k && k <  400) a[0]++;
            if( 400 <= k && k <  800) a[1]++;
            if( 800 <= k && k < 1200) a[2]++;
            if(1200 <= k && k < 1600) a[3]++;
            if(1600 <= k && k < 2000) a[4]++;
            if(2000 <= k && k < 2400) a[5]++;
            if(2400 <= k && k < 2800) a[6]++;
            if(2800 <= k && k < 3200) a[7]++;
            if(3200 <= k) a[8]++;
        }
        int ans1 = 0;
        for(int i = 0; i < 8; i++)
            if(a[i] > 0) ans1++;
        int ans2;
        if(ans1 == 0){
            ans1 = 1;
            ans2 = Math.min(9, a[8]);
        }else
            ans2 = Math.min(9, ans1 + a[8]);
        System.out.print(ans1 + " " + ans2);
    }
}