import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        long[] v = new long[N];
        for(int i = 0; i < N; i++){
            v[i] = sc.nextLong();
        }
        Arrays.sort(v);

        double ans = 0;
        for(int i = N-1; i >= N - A; i--){
            ans += v[i];
        }
        ans = (double) ans / A;
        boolean b = true;
        int p = N - A + 1;
        int count2 = 1;
        while(b == true && p < N){
            if(v[p-1] == v[p]){
                count2++;
                p++;
            }
            else{
                b = false;
            }
        }
        int count1 = 0;
        int q = N - A;
        boolean bl = true;
        while(bl == true){
            if(v[q] == v[q-1]){
                count1++;
                q--;
            }
            else{
                bl = false;   
            }
            if(q == 0){
                bl = false;
            }
        }

        long ans2 = 0;
        if(v[N-A] == v[N-1]){
            long y = 1;
            for(int i = count2; i < count1 + count2; i++){
                for(int j = A; j < Math.min(B, count1 + count2); j++){
                    for(int k = i; k > i - j; k--){
                        y *= k;
                        y /= (i - k + 1);
                    }
                }
            }
            ans2 += y;
        }
        else{
            int c = count1 + count2;
            //c C count2
            long x = 1;
            for(int i = c; i > c - count2; i--){
                x *= i;
                x /= (c - i + 1);
            }
            System.out.println(c + " " + count2);
            ans2 += x;    
        }
        System.out.println(ans);
        System.out.println(ans2);
    }
}