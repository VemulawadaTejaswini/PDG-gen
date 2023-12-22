import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        ArrayList<Long> primeList = getPrimeList(Math.max(a,b));
        int ans = 0;
        for(long p : primeList){
            if(a % p == 0 && b % p == 0){
                ans++;
            }
        }
        System.out.println(ans+1);
    }
    
    public static ArrayList<Long> getPrimeList(long l){
        int len = (int)Math.pow(l,0.5);
        ArrayList<Long> ret = new ArrayList<>();
        for(int i = 3; i <= len; i += 2){
            boolean bool = true;
            for(long p : ret){
                if(i % p == 0){
                    bool = false;
                    break;
                }
            }
            if(bool) ret.add((long)i);
        }
        ret.add((long)2);
        return ret;
    }
}
