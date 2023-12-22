import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] T = new long[N];
        for(int i=0;i<N;i++){
            T[i] = sc.nextLong();
        }
        Arrays.sort(T);
        long ans = T[N-1];
        for(int i=N-2;i>=0;i--){
            ans = scm(ans,T[i]);
        }
        System.out.println(ans);
    }
    static long scm(long A, long B){//A>=B
        if(A%B==0) return A;
        long g = gcd(A,B);
        return A/g*B;
    }
    static long gcd(long C,long D){
        if(C<D){
            long temp = D;
            D = C;
            C = temp;
        }
        if(C%D==0) return D;
        else return gcd(D,C%D);
    }
}
