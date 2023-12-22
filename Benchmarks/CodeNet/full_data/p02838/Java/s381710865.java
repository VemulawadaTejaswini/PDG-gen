import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long base = 1000000007L;
        long nums[] = new long[N];
        for(int i = 0; i < N; i++){
            nums[i] = sc.nextLong();
        }
        long result = 0;
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                result += nums[i]^nums[j];
                result %= base;
            }
        }
        System.out.println(result);
    }
}
