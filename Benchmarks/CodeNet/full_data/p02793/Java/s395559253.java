import java.util.*;
 
public class Main {
public static final long MOD = 1000000007;

	public static long calc_pow_MOD(long base, long pow){
        if(pow == 0) return 1L;

        long ret = 1L, mul = base;
        while(pow > 0){
            if(pow % 2 == 1){
                ret *= mul;
                ret %= MOD;
            }
            pow >>= 1;
            mul *= mul;
            mul %= MOD;
        }

        return ret;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] a = new long[N];
        for(int i = 0; i < N; i++){
            a[i] = Long.parseLong(sc.next());
        }
        sc.close();

        Map<Integer, Integer> common_lcm_prime_factor = new HashMap<>();
        Map<Integer, Integer> each_prime_factor = new HashMap<>();
        Long ans = 0L;

        for(int i = 0; i < N; i++){
            Long tmp = a[i];
            each_prime_factor.clear();
            
            for(int j = 2; j <= a[i]; j++){
                int cnt = 0;
                while(tmp % j == 0){
                    tmp /= j;
                    cnt++;
                    
                }
                if(cnt > 0) each_prime_factor.put(j, cnt);

                if(tmp == 1) break;
            }

            for(int each_key : each_prime_factor.keySet()){
                int each_val = each_prime_factor.get(each_key);
                if(!common_lcm_prime_factor.containsKey(each_key)){
                    common_lcm_prime_factor.put(each_key, each_val);
                }else{
                    common_lcm_prime_factor.put(each_key,
                                                Math.max(each_val, common_lcm_prime_factor.get(each_key)));
                }
            }
        }

        for(int i = 0; i < N; i++){
            long tmp = a[i];
            each_prime_factor.clear();
            
            for(int j = 2; j <= a[i]; j++){
                int cnt = 0;
                while(tmp % j == 0){
                    tmp /= j;
                    cnt++;
                    
                }
                if(cnt > 0) each_prime_factor.put(j, cnt);

                if(tmp == 1) break;
            }

            long tmp_ans = 1L;
            for(int common_key : common_lcm_prime_factor.keySet()){
                int common_val = common_lcm_prime_factor.get(common_key);
                int pow;
                if(each_prime_factor.containsKey(common_key)){
                    pow = common_val - each_prime_factor.get(common_key);
                }else{
                    pow = common_val;
                }
                tmp_ans *= calc_pow_MOD(common_key, pow);
                tmp_ans %= MOD;
            }
            ans += tmp_ans;
            ans %= MOD;
        }
        System.out.println(ans);
    }
}