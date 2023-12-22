import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger[] nums = new BigInteger[N];
        BigInteger base = new BigInteger("1000000007");
        for(int i = 0; i < N; i++){
            nums[i] = BigInteger.valueOf(sc.nextLong());
        }
        BigInteger result = BigInteger.ZERO;
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                result = result.add(nums[i].xor(nums[j]));
            }
        }
        System.out.println(result.mod(base));
    }
}

