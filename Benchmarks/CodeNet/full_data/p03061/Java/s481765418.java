import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Long As[] = new Long[N];
        for(int i = 0;i < N;i++)
            As[i] = sc.nextLong();
        long L[] = new long[N];
        long R[] = new long[N];
        ArrayList<Long> M = new ArrayList(Collections.nCopies(N,0));

        for(int i = 0;i < N - 1;i++)
            L[i + 1] = gcd(L[i],As[i]);
        for(int i = N - 1;i > 0;i--)
            R[i - 1] = gcd(R[i],As[i]);
        for(int i = 0;i < N;i++)
            M.set(i,gcd(L[i],R[i]));

        System.out.println(max(M));
    }

    public static long max(List<Long> ar){
        long max = 0;
        for(int i = 0; i< ar.size();i++)
            if(max < ar.get(i))
                max = ar.get(i);
        return max;
    }

    public static Integer min(List<Integer> ar){
        int min = 10000;
        int index = 0;
        for(int i = 0; i< ar.size();i++){
            if(min > ar.get(i)){
                min = ar.get(i);
                index = i;
            }
        }
        return min;
    }


    public static long gcd(long m, long n) {
        if(m == 0)
            return n;
        if(n == 0)
            return m;
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

}



