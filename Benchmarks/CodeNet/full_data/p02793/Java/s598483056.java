import java.util.*;
 
import java.io.*;
 
public class Main{

    public static void primeFactMax(HashMap<Long, Long> primeMax, long num, HashMap<Long, Long> prime){
        for(long i = 2; i <= num; i++){
            if(num == 1L) return;
            if(num % i == 0L){
                if(prime.get(i) == null){
                    prime.put(i, 1L);
                }else{
                    prime.put(i, prime.get(i)+1);
                }
                if(primeMax.get(i) == null){
                    primeMax.put(i, 1L);
                }else{
                    primeMax.put(i, Math.max(prime.get(i), primeMax.get(i)));
                }
                primeFactMax(primeMax, num/i, prime);
                break;
            }else{
                continue;
            }
        }
    }
    
    public static void primeFact(HashMap<Long, Long> prime, long num){
        for(long i = 2; i <= num; i++){
            if(num == 1L) return;
            if(num % i == 0L){
                if(prime.get(i) == null){
                    prime.put(i, 1L);
                }else{
                    prime.put(i, prime.get(i)+1);
                }
                primeFact(prime, num/i);
                break;
            }else{
                continue;
            }
        }
    }
    public static long primeDivide(HashMap<Long, Long> gcVal, HashMap<Long, Long> val, long res){
        long sum;
        long result = 1;
        for(Long i : gcVal.keySet()){
            sum = gcVal.get(i) - val.getOrDefault(i, 0L);
            result = (result*((long)Math.pow(i, sum)))%res;
        }
        return result;
    }
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long[] A = new long[N];
        for(int i = 0; i < N; i++){
            A[i] = s.nextLong();
        }
        
        HashMap<Long, Long> gcVal = new HashMap<Long, Long>();
        for(int i = 0; i < N; i++){
            HashMap<Long, Long> Val = new HashMap<Long, Long>();
            primeFactMax(gcVal, A[i], Val);
        }
        
        long sum = 0;
        for(int i = 0; i < N; i++){
            HashMap<Long, Long> Val = new HashMap<Long, Long>();
            primeFact(Val, A[i]);
            sum = (sum + primeDivide(gcVal, Val, 1000000007))%1000000007;
        }
        System.out.println(sum);

	}
} 