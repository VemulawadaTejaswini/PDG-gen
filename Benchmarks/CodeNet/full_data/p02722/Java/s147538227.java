import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        System.out.println(solve(N));
    }
    static
    long solve(long N){

        long ans = 0;
        //factors of N
        for(long l: listFactors(N)){
            long temp = N;
            if(l==1) continue;
            while(temp % l ==0) temp= temp/l;
            if(temp%l==1) ans++;
        }

        ans += listFactors(N-1).size()-1;

        return ans;
    }
    static Collection<Long> listFactors(long N ){
        Set<Long> l = new HashSet<>();

        for (long i = 1; i*i <= N ; i++) {
            if(N%i==0){
                l.add(i);
                l.add(N/i);
            }
        }
        return l;
    }


}
