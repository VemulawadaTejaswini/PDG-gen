import java.util.*;
 
import java.io.*;
 
public class Main{

    public static void primeFactMax(int[] primeMax, int num, int[] prime){
        for(int i = 2; i <= num; i++){
            if(num == 1) return;
            if(num % i == 0){
                prime[i]++;
                primeMax[i] = Math.max(primeMax[i], prime[i]);
                primeFactMax(primeMax, num/i, prime);
                break;
            }else{
                continue;
            }
        }
    }
    
    public static void primeFact(int[] prime, int num){
        for(int i = 2; i <= num; i++){
            if(num == 1) return;
            if(num % i == 0){
                prime[i]++;
                primeFact(prime, num/i);
                break;
            }else{
                continue;
            }
        }
    }

    public static long primeDivide(int[] gcVal, int[] val, long res){
        int[] sum = new int[gcVal.length];
        long result = 1;
        for(int i = 1; i < gcVal.length; i++){
            sum[i] = gcVal[i] - val[i];
            result *= ((long)Math.pow(i, sum[i]))%res;
        }
        return result;
    }
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = s.nextInt();
        }
        
        int[] gcVal = new int[1000001];
        for(int i = 0; i < N; i++){
            int[] Val = new int[1000001];
            primeFactMax(gcVal, A[i], Val);
        }
        
        long sum = 0;
        for(int i = 0; i < N; i++){
            int[] Val = new int[1000001];
            primeFact(Val, A[i]);
            sum += primeDivide(gcVal, Val, 1000000007)%1000000007;
        }
        System.out.println(sum);

	}
} 