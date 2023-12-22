import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        HashSet<Long> primeA = new HashSet<>();
        HashSet<Long> primeB = new HashSet<>();
        prime(a,primeA);
        prime(b,primeB);
        int ans = 0;
        for(Long num:primeA)if(primeB.contains(num)){
            //System.out.println(num);
            ans++;
        }
        System.out.println(ans+1);
    }

    private static void prime(long a,HashSet<Long> primeA){
        for(long i=2;i<Math.sqrt(a)+1;i++){
            if(a%i==0){
                boolean ok = true;
                for(Long n:primeA)if(i%n==0){
                    ok = false;
                    break;
                }
                if(ok)primeA.add(i);
                ok = true;
                long j = a/i;
                for(Long n:primeA)if(j%n==0){
                    ok=false;
                    break;
                }
                if(ok)primeA.add(j);
            }
        }
    }

}
